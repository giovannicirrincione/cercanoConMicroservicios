package cercanoOeste.servicePedido.Service;

import cercanoOeste.servicePedido.Entity.DetallePedido;
import cercanoOeste.servicePedido.Repository.BaseRepository;
import cercanoOeste.servicePedido.Repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido,Long> implements DetallePedidoService {
    @Autowired
    DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository, DetallePedidoRepository detallePedidoRepository) {
        super(baseRepository);

    }
}