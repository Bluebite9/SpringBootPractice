package springbootPractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact", schema = "accenturespringbootpractice")
public class Contact {
    @Id
    @Column(name = "id")
    private String id;
    private String phone;
    private String mobile;
    private String email;
}
