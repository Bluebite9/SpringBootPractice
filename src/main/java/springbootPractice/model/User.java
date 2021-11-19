package springbootPractice.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "accenturespringbootpractice")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
//    @Type(type = "json")
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    @Type(type = "json")
    private Contact contact;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meter_details_id")
    @Type(type = "json")
    private MeterDetails meterDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @Type(type = "json")
    @JoinColumn(name = "gdpr_id")
    private GDPR gdpr;

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public MeterDetails getMeterDetails() {
        return meterDetails;
    }

    public GDPR getGdpr() {
        return gdpr;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setMeterDetails(MeterDetails meterDetails) {
        this.meterDetails = meterDetails;
    }

    public void setGdpr(GDPR gdpr) {
        this.gdpr = gdpr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
