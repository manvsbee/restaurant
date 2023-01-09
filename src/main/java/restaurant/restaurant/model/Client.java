package restaurant.restaurant.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(max=20)
    private String nume;

    @NotBlank
    @Size(max=20)
    private String prenume;

    @NotBlank
    @Pattern(regexp = "(\\+40)[0-9]{9}")
    private String numar_tlf;

    @NotBlank
    @Size(max=20)
    @Pattern(regexp = ".*@.*[.].*")
    private String email;
}
