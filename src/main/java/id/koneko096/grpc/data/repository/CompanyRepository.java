package id.koneko096.grpc.data.repository;

import id.koneko096.grpc.data.model.CompanyData;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyData, Long> {}