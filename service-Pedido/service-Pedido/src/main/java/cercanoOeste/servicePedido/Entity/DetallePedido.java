package cercanoOeste.servicePedido.Entity;

import jakarta.persistence.*;
import lombok.*;

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