package cercanoOeste.servicePedido.Controller;

import cercanoOeste.servicePedido.Entity.DetallePedido;
import cercanoOeste.servicePedido.Service.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "pedidos/DetallePedido")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl>{
}