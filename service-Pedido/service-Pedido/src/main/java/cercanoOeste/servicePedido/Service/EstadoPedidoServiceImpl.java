package cercanoOeste.servicePedido.Service;

import cercanoOeste.servicePedido.Entity.EstadoPedido;
import cercanoOeste.servicePedido.Repository.BaseRepository;
import cercanoOeste.servicePedido.Repository.EstadoPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoPedidoServiceImpl extends BaseServiceImpl<EstadoPedido,Long> implements EstadoPedidoService{
    @Autowired
    EstadoPedidoRepository estadoPedidoRepository;
    public EstadoPedidoServiceImpl(BaseRepository<EstadoPedido, Long> baseRepository, EstadoPedidoRepository estadoPedidoRepository) {
        super(baseRepository);
    }
}