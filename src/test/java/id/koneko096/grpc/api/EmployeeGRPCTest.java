package id.koneko096.grpc.api;

import id.koneko096.grpc.CompanyGrpcApplication;
import id.koneko096.grpc.data.repository.CompanyRepository;
import id.koneko096.grpc.data.repository.DivisionRepository;
import id.koneko096.grpc.data.repository.EmploymentRepository;
import id.koneko096.grpc.service.Company;
import id.koneko096.grpc.service.CompanyServiceGrpc;
import io.grpc.inprocess.InProcessChannelBuilder;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DirtiesContext
@SpringBootTest(
    classes = CompanyGrpcApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.MOCK
)
@TestPropertySource(
    locations = "classpath:application-test.properties",
    properties = "grpc.inProcessServerName=testChannel"
)
public class EmployeeGRPCTest {

  @Autowired
  private EmploymentRepository employmentRepository;

  @Autowired
  private DivisionRepository divisionRepository;

  @Autowired
  private CompanyRepository companyRepository;

  @After
  public void tearDown() throws Exception {
    employmentRepository.deleteAll();
    divisionRepository.deleteAll();
    companyRepository.deleteAll();
  }

  @Sql("classpath:db/migrate.sql")
  @Test
  public void createCitizenTest() throws Exception {
    io.grpc.Channel ch = InProcessChannelBuilder.forName("testChannel").build();
    CompanyServiceGrpc.CompanyServiceBlockingStub stub = CompanyServiceGrpc.newBlockingStub(ch);

    Company.ListEmployeeStatusResponse respList =
        stub.listCompanyEmployees(Company.ListEmployeeRequest.newBuilder()
            .setCompanyId(1L)
            .build());
    assertEquals(0, respList.getEmployeesCount());

    Company.EmployeeStatus resp = stub.registerEmployee(Company.RegisterEmployeeRequest.newBuilder()
        .setCompanyId(1L)
        .setCitizenId(135L)
        .setDivisionId(1L)
        .build());

    stub.fireEmployee(Company.FireEmployeeRequest.newBuilder()
            .setEmployeeId(1L)
            .build());

    respList = stub.listCompanyEmployees(Company.ListEmployeeRequest.newBuilder()
            .setCompanyId(1L)
            .build());
    assertEquals(0, respList.getEmployeesCount());
  }
}
