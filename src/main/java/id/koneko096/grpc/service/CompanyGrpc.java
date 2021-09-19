package id.koneko096.grpc.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by afrizal on 19/09/2021.
 */
@GRpcService
public class CompanyGrpc extends CompanyServiceGrpc.CompanyServiceImplBase {

  @Autowired
  private CompanyService companyService;

  @Override
  public void listCompanyEmployees(Company.ListEmployeeRequest request, StreamObserver<Company.ListEmployeeStatusResponse> responseObserver) {
    responseObserver.onNext(companyService.ListCompanyEmployees(request));
    responseObserver.onCompleted();
  }

  @Override
  public void getEmployeeStatus(Company.GetEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
    responseObserver.onNext(companyService.GetEmployeeStatus(request));
    responseObserver.onCompleted();
  }

  @Override
  public void registerEmployee(Company.RegisterEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
    responseObserver.onNext(companyService.RegisterEmployee(request));
    responseObserver.onCompleted();
  }

  @Override
  public void mutateEmployee(Company.MutateEmployeeRequest request, StreamObserver<Company.EmployeeStatus> responseObserver) {
    responseObserver.onNext(companyService.MutateEmployeeRequest(request));
    responseObserver.onCompleted();
  }

  @Override
  public void fireEmployee(Company.FireEmployeeRequest request, StreamObserver<Company.Empty> responseObserver) {
    companyService.FireEmployee(request);
    responseObserver.onNext(Company.Empty.getDefaultInstance());
    responseObserver.onCompleted();
  }
}
