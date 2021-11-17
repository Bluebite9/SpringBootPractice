package springbootPractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "meter_details", schema = "accenturespringbootpractice")
public class MeterDetails {
    @Id
    @Column(name = "id")
    private String serial;
    private String model;
    private Date installationDate;
    private Date lastReadingDate;
    private Date deactivationDate;
    private String deactivationRemarks;
}
