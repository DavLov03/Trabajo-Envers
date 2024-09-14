package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Builder
@Entity
@Table(name = "Articulo")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Audited
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "id")
    private Long id;
    @Column(name = "precio")
    private int precio;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "articulo_categoria",
            joinColumns= @JoinColumn(name = "articulo_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria> categorias = new ArrayList<Categoria>();
}
