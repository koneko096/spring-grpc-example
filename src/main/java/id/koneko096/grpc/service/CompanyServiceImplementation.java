package id.koneko096.grpc.service;

import id.koneko096.grpc.data.model.Citizen;
import id.koneko096.grpc.data.model.CompanyData;
import id.koneko096.grpc.data.model.Division;
import id.koneko096.grpc.data.model.Employment;
import id.koneko096.grpc.data.repository.CitizenRepository;
import id.koneko096.grpc.data.repository.CompanyRepository;
import id.koneko096.grpc.data.repository.DivisionRepository;
import id.koneko096.grpc.data.repository.EmploymentRepository;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by afrizal on 19/09/2021.
 */
@Service
public class CompanyServiceImplementation implements CompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private DivisionRepository divisionRepository;

  @Autowired
  private CitizenRepository citizenRepository;

  @Autowired
  private EmploymentRepository employmentRepository;

  @Override
  public Company.ListEmployeeStatusResponse ListCompanyEmployees(Company.ListEmployeeRequest request) {
    List<Company.EmployeeStatus> employeeStatuses =
        employmentRepository.findByCompany(request.getCompanyId())
            .stream()
            .map(this::getEmployeeStatus)
            .collect(Collectors.toList());
    return Company.ListEmployeeStatusResponse.newBuilder().addAllEmployees(employeeStatuses).build();
  }

  @Override
  public Company.EmployeeStatus GetEmployeeStatus(Company.GetEmployeeRequest request) {
    Employment employment = this.employmentRepository.findOne(request.getEmployeeId());
    return getEmployeeStatus(employment);
  }

  @Override
  public Company.EmployeeStatus RegisterEmployee(Company.RegisterEmployeeRequest request) {
    Employment emp = Employment.EmploymentFactory(request.getCitizenId(), request.getDivisionId());
    Employment employment = this.employmentRepository.save(emp);
    return getEmployeeStatus(employment);
  }

  @Override
  public Company.EmployeeStatus MutateEmployeeRequest(Company.MutateEmployeeRequest request) {
    Employment employment = this.employmentRepository.findOne(request.getEmployeeId());
    assert(employment.getDivisionId().equals(request.getCurrentDivisionId())); // TODO
    employment.setDivisionId(request.getNewDivisionId());
    employment = this.employmentRepository.save(employment);
    return getEmployeeStatus(employment);
  }

  @Override
  public Company.EmployeeStatus FireEmployee(Company.FireEmployeeRequest request) {
    Employment employment = this.employmentRepository.findOne(request.getEmployeeId());
    employment.setLeaveDate(LocalDate.now());
    return getEmployeeStatus(this.employmentRepository.save(employment));
  }

  private Company.EmployeeStatus getEmployeeStatus(Employment employment) {
    Division division = this.divisionRepository.findOne(employment.getDivisionId());
    CompanyData company = this.companyRepository.findOne(division.getCompanyId());
    Citizen citizen = new Citizen(); //   TODO: migrate to real upstream
//        this.citizenRepository.findOne(employment.getCitizenId());
    return Company.EmployeeStatus.newBuilder()
        .setCitizenId(employment.getCitizenId())
        .setName(citizen.getLastName() + ", " + citizen.getFirstName())
        .setCompanyName(company.getName())
        .setDivisionName(division.getName())
        .build();
  }
}
