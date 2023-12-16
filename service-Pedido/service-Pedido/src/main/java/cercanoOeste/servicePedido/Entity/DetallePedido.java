package cercanoOeste.servicePedido.Entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetallePedido extends Base{

    private int cantidadProducto;

    private float subtotalPedido;

    @Column(name = "product_id")
    private Long productId;
}