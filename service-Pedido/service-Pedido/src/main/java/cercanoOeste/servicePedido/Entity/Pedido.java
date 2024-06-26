package cercanoOeste.servicePedido.Entity;

import cercanoOeste.servicePedido.Enum.TipoEnvio;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pedido extends Base{
    private int costoDelivery;
    private int Demora;
    private String apellidoCliente;

    private String direccionEntrega;

    private String nombreCliente;

    private int telefonoCliente;

    private float montoTotal;


    @Column(name = "fechaHoraPedido")
    private LocalDateTime fechaHoraPedido;

    @Column(name = "fechaHoraBaja")
    private LocalDateTime fechaHoraBaja;

    @Column(name = "tipoEnvio")
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<DetallePedido> detalles = new ArrayList<DetallePedido>();

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_estadoPedido")
    private EstadoPedido estadoPedido;
}