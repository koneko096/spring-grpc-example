package id.koneko096.grpc.api;

import id.koneko096.grpc.CompanyGrpcApplication;
import id.koneko096.grpc.data.repository.CompanyRepository;
import id.koneko096.grpc.data.repository.DivisionRepository;
import id.koneko096.grpc.data.repository.EmploymentRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@DirtiesContext
@SpringBootTest(
    classes = CompanyGrpcApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.MOCK
)
@TestPropertySource(
    locations = "classpath:application-test.properties"
)
@AutoConfigureMockMvc
public class EmployeeRESTTest {

  @Autowired
  private MockMvc mvc;

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
    mvc.perform(get("/api/v1/company/1").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(content().string("[]"));

    mvc.perform(post("/api/v1/employee")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"divisionId\": 1, \"companyId\": 1, \"citizenId\": 135}")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());

    Long employeeId = 1L;
    mvc.perform(delete("/api/v1/employee/" + employeeId).accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());

    mvc.perform(get("/api/v1/company/1").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(content().string("[]"));
  }
}
