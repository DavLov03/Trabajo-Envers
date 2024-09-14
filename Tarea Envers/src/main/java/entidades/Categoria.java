package entidades;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Categoria")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder

@Audited
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni")
    private Long id;
    @Column(name = "denominacion")
    private String denominacion;

}
