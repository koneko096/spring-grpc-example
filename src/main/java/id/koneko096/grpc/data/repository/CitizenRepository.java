package id.koneko096.grpc.data.repository;

import id.koneko096.grpc.data.model.Citizen;

/**
 * Created by afrizal on 22/11/2018.
 */
public interface CitizenRepository {
    Citizen update(Citizen entity);
    Citizen create(Citizen entity);
    Citizen findOne(Long id);
    Iterable<Citizen> findAll();
    void delete(Long id);
}
