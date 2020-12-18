package pl.coderslab.Charity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Table(name="donations")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donation implements EntityModel {


    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;
    //COS NIE TAK

    @ManyToOne
    @JoinColumn(name = "institution_id")
    private Institution institution;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="zipcode")
    private String ZipCode;

    @Column(name="pickupdate")
    private LocalDate pickUpDate;

    @Column(name="pickuptime")
    private LocalTime pickUpTime;

    @Column(name="pickupcomment")
    private String pickUpComment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="donation_id")
    private Long id;
}
