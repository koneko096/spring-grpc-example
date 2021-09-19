package id.koneko096.grpc.service;

public interface CompanyService {

  Company.ListEmployeeStatusResponse ListCompanyEmployees(Company.ListEmployeeRequest request);

  Company.EmployeeStatus GetEmployeeStatus (Company.GetEmployeeRequest request);

  Company.EmployeeStatus RegisterEmployee(Company.RegisterEmployeeRequest request);

  Company.EmployeeStatus MutateEmployeeRequest(Company.MutateEmployeeRequest request);

  void FireEmployee(Company.FireEmployeeRequest request);
}
