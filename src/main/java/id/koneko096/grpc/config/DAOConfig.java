package id.koneko096.grpc.config;

import id.koneko096.grpc.data.dao.CitizenDAO;
import id.koneko096.grpc.data.repository.CitizenRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by afrizal on 22/11/2018.
 */
@Configuration
public class DAOConfig {
    @Bean
    public CitizenRepository citizenRepository() {
        return new CitizenDAO();
    }
}
