package cercanoOeste.serviceproduct.Services;

import cercanoOeste.serviceproduct.entity.Producto;

import java.util.List;

public interface ProductoService extends BaseService<Producto,Long>{
    List<Producto> busquedaPorAlta() throws Exception;
}