package springbootPractice.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gdpr", schema = "accenturespringbootpractice")
public class GDPR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean approval;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date approvalDateTime;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date withdrawalOfApproval;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }

    public Date getApprovalDateTime() {
        return approvalDateTime;
    }

    public void setApprovalDateTime(Date approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    public Date getWithdrawalOfApproval() {
        return withdrawalOfApproval;
    }

    public void setWithdrawalOfApproval(Date withdrawalOfApproval) {
        this.withdrawalOfApproval = withdrawalOfApproval;
    }
}
