package id.koneko096.grpc.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

import javax.persistence.*;

/**
 * Created by afrizal on 22/11/2018.
 */
@Entity
@Table(name = "employments")
@Data
@NoArgsConstructor
@AllArgsConstructor
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


    public Employment(Long citizenId, Long divisionId) {
        this.citizenId = citizenId;
        this.divisionId = divisionId;
        this.joinDate = LocalDate.now();
    }

}
