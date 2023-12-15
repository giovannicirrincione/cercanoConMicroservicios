package cercanoOeste.serviceproduct.Services;

import cercanoOeste.serviceproduct.entity.Categoria;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria,Long>{
    List<Categoria> busquedaPorAltaCategoria() throws Exception;
}
