package cercanoOeste.serviceproduct.Services;

import cercanoOeste.serviceproduct.entity.Categoria;
import cercanoOeste.serviceproduct.repository.BaseRepository;
import cercanoOeste.serviceproduct.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long> implements CategoriaService{
    @Autowired
    CategoriaRepository categoriaRepository;
    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository, CategoriaRepository categoriaRepository) {
        super(baseRepository);
    }
    @Override
    public List<Categoria> busquedaPorAltaCategoria() throws Exception {
        try {
            List<Categoria> categorias = categoriaRepository.busquedaPorAltaCategoria();
            return categorias;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}