package id.koneko096.grpc.data.repository;

import id.koneko096.grpc.data.model.Citizen;

/**
 * Created by afrizal on 22/11/2018.
 */
public interface CitizenRepository {
    public Citizen update(Citizen entity);
    public Citizen create(Citizen entity);
    public Citizen findOne(Long id);
    public Iterable<Citizen> findAll();
    public void delete(Long id);
}
