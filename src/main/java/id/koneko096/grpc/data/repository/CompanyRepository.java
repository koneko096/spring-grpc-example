package id.koneko096.grpc.data.repository;

import id.koneko096.grpc.data.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {}