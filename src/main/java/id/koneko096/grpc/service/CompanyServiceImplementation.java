package id.koneko096.grpc.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import org.springframework.beans.factory.annotation.Autowired;

import id.koneko096.grpc.data.repository.*;

/**
 * Created by afrizal on 21/11/2018.
 */
@GRpcService
public class CompanyServiceImplementation extends CompanyServiceGrpc.CompanyServiceImplBase {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public void getEmployeeStatus(Company.GetEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
        Company.EmployeeStatus employeeStatus = Company.EmployeeStatus.newBuilder()
                .setCompanyName("Xtr")
                .setDivisionName("Babu")
                .build();
        responseObserver.onNext(employeeStatus);
        responseObserver.onCompleted();
    }

    @Override
    public void registerEmployee(Company.RegisterEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
        Company.EmployeeStatus employeeStatus = Company.EmployeeStatus.newBuilder()
                .setCompanyName("Xtr")
                .setDivisionName("Babu")
                .build();
        responseObserver.onNext(employeeStatus);
        responseObserver.onCompleted();
    }

    @Override
    public void mutateEmployee(Company.MutateEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
        Company.EmployeeStatus employeeStatus = Company.EmployeeStatus.newBuilder()
                .setCompanyName("BeEl2")
                .setDivisionName("Retur")
                .build();
        responseObserver.onNext(employeeStatus);
        responseObserver.onCompleted();
    }

    @Override
    public void fireEmployee(Company.FireEmployeeRequest request, StreamObserver<Company.Empty> responseObserver) {
        responseObserver.onNext(Company.Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

}
