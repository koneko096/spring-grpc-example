package id.koneko096.grpc.data.model;

import javax.persistence.*;

@Entity
@Table(name = "divisions")
public class Division {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "company_id")
    private Long companyId;

    public String getName() {
        return name;
    }

    public Long getCompanyId() {
        return companyId;
    }
}