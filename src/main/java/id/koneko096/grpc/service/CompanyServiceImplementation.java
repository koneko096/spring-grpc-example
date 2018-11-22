package id.koneko096.grpc.service;

import id.koneko096.grpc.data.model.Citizen;
import id.koneko096.grpc.data.model.CompanyData;
import id.koneko096.grpc.data.model.Division;
import id.koneko096.grpc.data.model.Employment;
import io.grpc.stub.StreamObserver;
import org.joda.time.LocalDate;
import org.lognet.springboot.grpc.GRpcService;

import org.springframework.beans.factory.annotation.Autowired;

import id.koneko096.grpc.data.repository.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by afrizal on 21/11/2018.
 */
@GRpcService
public class CompanyServiceImplementation extends CompanyServiceGrpc.CompanyServiceImplBase {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private EmploymentRepository employmentRepository;

    @Override
    public void listCompanyEmployees(Company.ListEmployeeRequest request, StreamObserver<Company.ListEmployeeStatusResponse> responseObserver) {
        List<Company.EmployeeStatus> employeeStatuses =
                employmentRepository.findByCompany(request.getCompanyId())
                                    .stream()
                                    .map(this::getEmployeeStatus)
                                    .collect(Collectors.toList());
        responseObserver.onNext(Company.ListEmployeeStatusResponse.newBuilder().addAllEmployees(employeeStatuses).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getEmployeeStatus(Company.GetEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
        Employment employment = this.employmentRepository.findOne(request.getEmployeeId());
        Company.EmployeeStatus employeeStatus = getEmployeeStatus(employment);
        responseObserver.onNext(employeeStatus);
        responseObserver.onCompleted();
    }

    @Override
    public void registerEmployee(Company.RegisterEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
        Employment employment = this.employmentRepository.save(new Employment(request.getCitizenId(), request.getDivisionId()));
        Company.EmployeeStatus employeeStatus = getEmployeeStatus(employment);
        responseObserver.onNext(employeeStatus);
        responseObserver.onCompleted();
    }

    @Override
    public void mutateEmployee(Company.MutateEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
        Employment employment = this.employmentRepository.findOne(request.getEmployeeId());
        assert(employment.getDivisionId().equals(request.getCurrentDivisionId())); // TODO
        employment.setDivisionId(request.getNewDivisionId());
        employment = this.employmentRepository.save(employment);

        Company.EmployeeStatus employeeStatus = getEmployeeStatus(employment);
        responseObserver.onNext(employeeStatus);
        responseObserver.onCompleted();
    }

    @Override
    public void fireEmployee(Company.FireEmployeeRequest request, StreamObserver<Company.Empty> responseObserver) {
        Employment employment = this.employmentRepository.findOne(request.getEmployeeId());
        employment.setLeaveDate(LocalDate.now());
        employment = this.employmentRepository.save(employment);

        responseObserver.onNext(Company.Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    public Company.EmployeeStatus getEmployeeStatus(Employment employment) {
        Division division = this.divisionRepository.findOne(employment.getDivisionId());
        CompanyData company = this.companyRepository.findOne(division.getCompanyId());
        Citizen citizen = this.citizenRepository.findOne(employment.getCitizenId());
        return Company.EmployeeStatus.newBuilder()
                .setCitizenId(employment.getCitizenId())
                .setName(citizen.getLastName() + ", " + citizen.getFirstName())
                .setCompanyName(company.getName())
                .setDivisionName(division.getName())
                .build();
    }
}
