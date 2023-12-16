package cercanoOeste.servicePedido.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estadopedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EstadoPedido extends Base{
    private String nombre;
}