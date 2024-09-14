package entidades;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder

@Audited
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni", unique = true)
    private int dni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domiciliok")
    private Domicilio domicilio;
}
