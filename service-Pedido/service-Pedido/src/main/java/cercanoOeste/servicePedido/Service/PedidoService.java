package cercanoOeste.servicePedido.Service;

import cercanoOeste.servicePedido.DTOS.DTOConfirmacion;
import cercanoOeste.servicePedido.DTOS.DTOPagoRealizado;
import cercanoOeste.servicePedido.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.servicePedido.Entity.Pedido;

import java.util.List;

public interface PedidoService extends BaseService<Pedido,Long>{
    DTOPedidoAconfirmar realizarPedido(Pedido pedido) throws Exception;

    Pedido rechazarPedido(Long id) throws Exception;
    Pedido AceptarPedidoDelivery(Long id,int demora, int costoEnvio)throws Exception;

    Pedido AceptarPedidoTakeAway(Long id, int demora) throws Exception;
    List<Pedido> BusquedaPedidos() throws Exception;
    DTOConfirmacion ConfirmarPedido(Long id) throws Exception;

    void cancelarPedido(Long id) throws Exception;
    DTOPagoRealizado pagoRealizado(Long id) throws Exception;
    Pedido PedidoListo(Long id) throws Exception;
}