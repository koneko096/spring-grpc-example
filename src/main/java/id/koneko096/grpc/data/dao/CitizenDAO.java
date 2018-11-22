package id.koneko096.grpc.data.dao;

import id.koneko096.grpc.api.CitizenApi;
import id.koneko096.grpc.data.model.Citizen;
import id.koneko096.grpc.data.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Created by afrizal on 21/11/2018.
 */
public class CitizenDAO implements CitizenRepository {
    @Autowired
    CitizenApi api;

    @Override
    public Citizen findOne(Long id) {
        return api.getCitizenDetails(id);
    }

    @Override
    public Iterable<Citizen> findAll() {
        return api.getAllCitizens();
    }

    @Transactional
    @Override
    public void delete(Long id) {
        api.deleteCitizen(id);
    }

    @Transactional
    @Override
    public Citizen update(Citizen entity) {
        return api.updateCitizen(entity.getId(), entity);
    }

    @Transactional
    @Override
    public Citizen create(Citizen entity) {
        return api.createCitizen(entity);
    }
}