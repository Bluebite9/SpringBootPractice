package springbootPractice.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meter_details", schema = "accenturespringbootpractice")
public class MeterDetails {
    @Id
    @Column(name = "serial")
    private String serial;
    private String model;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date installationDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date lastReadingDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date deactivationDate;
    private String deactivationRemarks;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public Date getLastReadingDate() {
        return lastReadingDate;
    }

    public void setLastReadingDate(Date lastReadingDate) {
        this.lastReadingDate = lastReadingDate;
    }

    public Date getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(Date deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public String getDeactivationRemarks() {
        return deactivationRemarks;
    }

    public void setDeactivationRemarks(String deactivationRemarks) {
        this.deactivationRemarks = deactivationRemarks;
    }
}
