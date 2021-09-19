package id.koneko096.grpc.api;

import id.koneko096.grpc.service.Company;
import id.koneko096.grpc.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by afrizal on 19/09/2021.
 */
@RestController
@RequestMapping("/api/v1")
public class CompanyController {

  @Autowired
  private CompanyService service;

  @GetMapping(
      value = "/company/{companyId}",
      produces = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      }
  )
  Company.ListEmployeeStatusResponse company(@PathVariable long companyId) {
    return service.ListCompanyEmployees(Company.ListEmployeeRequest.newBuilder().setCompanyId(companyId).build());
  }

  @GetMapping(
      value = "/employee/{employeeId}/status",
      produces = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      }
  )
  Company.EmployeeStatus employee(@PathVariable long employeeId) {
    return service.GetEmployeeStatus(Company.GetEmployeeRequest.newBuilder().setEmployeeId(employeeId).build());
  }

  @PostMapping(
      value = "/employee",
      consumes = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      },
      produces = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      }
  )
  Company.EmployeeStatus hire(@PathVariable long employeeId) {
    return service.GetEmployeeStatus(Company.GetEmployeeRequest.newBuilder().setEmployeeId(employeeId).build());
  }

  @PutMapping(
      value = "/employee/{employeeId}",
      consumes = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      },
      produces = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      }
  )
  Company.EmployeeStatus mutate(@PathVariable long employeeId) {
    return service.GetEmployeeStatus(Company.GetEmployeeRequest.newBuilder().setEmployeeId(employeeId).build());
  }

  @DeleteMapping(
      value = "/employee/{employeeId}",
      produces = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_XML_VALUE,
          "application/x-protobuf"
      }
  )
  Company.EmployeeStatus fire(@PathVariable long employeeId) {
    return service.GetEmployeeStatus(Company.GetEmployeeRequest.newBuilder().setEmployeeId(employeeId).build());
  }
}
