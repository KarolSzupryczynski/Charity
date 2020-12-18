package pl.coderslab.Charity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="institutions")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Institution implements EntityModel {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="institution_id")
    private Long id;
}
