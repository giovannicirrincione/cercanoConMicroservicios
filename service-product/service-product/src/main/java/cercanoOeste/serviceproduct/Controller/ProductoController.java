package cercanoOeste.serviceproduct.Controller;

import cercanoOeste.serviceproduct.Services.ProductoServiceImpl;
import cercanoOeste.serviceproduct.entity.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "producto")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl>{
    @GetMapping("/busquedaPorAlta")
    public ResponseEntity<?> busquedaPorAlta(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedaPorAlta());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }
}