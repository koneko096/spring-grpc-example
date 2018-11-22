package id.koneko096.grpc.data.model;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class CompanyData {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    public String getName() {
        return name;
    }
}