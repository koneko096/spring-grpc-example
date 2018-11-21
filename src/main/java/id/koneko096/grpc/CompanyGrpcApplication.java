package id.koneko096.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by afrizal on 21/11/2018.
 */
@SpringBootApplication
@EnableJpaRepositories("id.koneko096.grpc.data.repository")
@EntityScan("id.koneko096.grpc.data.model")
public class CompanyGrpcApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CompanyGrpcApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CompanyGrpcApplication.class,args);
    }
}
