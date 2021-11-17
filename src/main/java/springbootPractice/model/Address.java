package springbootPractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address", schema = "accenturespringbootpractice")
public class Address {
    @Id
    @Column(name = "id")
    private String id;
    private String countryCode;
    private String city;
    private String zipCode;
    private String street;
    private String buildingNumber;
    private int floor;
    private int door;
}
