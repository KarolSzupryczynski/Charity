package pl.coderslab.Charity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="categories")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category implements EntityModel {

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long id;
}
