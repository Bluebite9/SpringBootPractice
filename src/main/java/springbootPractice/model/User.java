package springbootPractice.model;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "accenturespringbootpractice")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    @OneToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;
    @OneToOne
    @JoinColumn(name = "meter_details_id", nullable = false)
    private MeterDetails meterDetails;
    @OneToOne
    @JoinColumn(name = "gdpr_id", nullable = false)
    private GDPR gdpr;
}
