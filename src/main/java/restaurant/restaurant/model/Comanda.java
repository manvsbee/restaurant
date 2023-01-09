package restaurant.restaurant.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="comanda")
public class Comanda {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @ManyToOne
    private int id_client;

    @NotBlank
    private LocalDateTime data;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status{
        IN_PROGRESS, IN_DELIVERY, DELIVERED, CANCELED
    }

}
