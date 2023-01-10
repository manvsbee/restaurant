package restaurant.restaurant.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="preparat")
public class Preparat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nume;

    @NotBlank
    private String descriere;

    @NotBlank
    private int pret;

    @ManyToMany
    List<Comanda> comenzi;

}
