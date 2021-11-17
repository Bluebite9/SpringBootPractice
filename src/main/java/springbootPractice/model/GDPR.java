package springbootPractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "gdpr", schema = "accenturespringbootpractice")
public class GDPR {
    @Id
    @Column(name = "id")
    private boolean approval;
    private Date approvalDateTime;
    private Date withdrawalOfApproval;
}
