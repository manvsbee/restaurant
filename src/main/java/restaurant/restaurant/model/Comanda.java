package restaurant.restaurant.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="comanda")
public class Comanda {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id")
    private Client client;

    @NotBlank
    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status{
        IN_PROGRESS, IN_DELIVERY, DELIVERED, CANCELED
    }

    @ManyToMany
    @JoinTable(name = "comanda_preparat",
                joinColumns = {
                    @JoinColumn(name = "id_comanda", referencedColumnName = "id")},
                inverseJoinColumns = {
                    @JoinColumn(name = "id_preparat", referencedColumnName = "id")}
                )
    List<Preparat> preparate;

}
