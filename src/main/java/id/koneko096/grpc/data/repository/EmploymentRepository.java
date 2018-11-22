package id.koneko096.grpc.data.repository;

import id.koneko096.grpc.data.model.Employment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by afrizal on 22/11/2018.
 */
public interface EmploymentRepository extends CrudRepository<Employment, Long> {
    @Query("select e from Employment e, Division d where e.divisionId = d.id and d.companyId = ?1")
    public List<Employment> findByCompany(Long companyId);
}
