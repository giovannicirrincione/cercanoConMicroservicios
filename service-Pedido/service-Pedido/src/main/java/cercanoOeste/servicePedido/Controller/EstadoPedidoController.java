package cercanoOeste.servicePedido.Controller;

import cercanoOeste.servicePedido.Entity.EstadoPedido;
import cercanoOeste.servicePedido.Service.EstadoPedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "pedidos/EstadoPedido")

public class EstadoPedidoController extends BaseControllerImpl<EstadoPedido, EstadoPedidoServiceImpl>{
}
