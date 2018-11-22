package id.koneko096.grpc.data.dao;

import id.koneko096.grpc.data.model.Employment;
import id.koneko096.grpc.data.repository.EmploymentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by afrizal on 22/11/2018.
 */
public class EmploymentDAO implements EmploymentRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Employment> findByCompany(Long companyId) {
//        return em.createQuery("select * from employments",);
        return null;
    }

    @Override
    public <S extends Employment> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Employment> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Employment findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Employment> findAll() {
        return null;
    }

    @Override
    public Iterable<Employment> findAll(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Employment entity) {

    }

    @Override
    public void delete(Iterable<? extends Employment> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
