package id.koneko096.grpc.data.model;

import lombok.Data;
import org.joda.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by afrizal on 22/11/2018.
 */
@Entity
@Table(name = "employments")
@Data
public class Employment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "employee_id")
    Long employeeId;

    @Column(name = "citizen_id")
    Long citizenId;

    @Column(name = "division_id")
    Long divisionId;

    @Column(name = "join_date")
    LocalDate joinDate;

    @Column(name = "leave_date")
    LocalDate leaveDate;


    public static Employment EmploymentFactory(Long citizenId, Long divisionId) {
        Employment employment = new Employment();
        employment.citizenId = citizenId;
        employment.divisionId = divisionId;
        employment.joinDate = LocalDate.now();
        return employment;
    }

}
