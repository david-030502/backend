package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Producto;
import utp.edu.pe.backend.services.IProductoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {
    @Autowired
    private IProductoService service;

    @GetMapping("/productos")
    public List<Producto> getAll(){
        return service.getAll();
    }

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto saveProducto(@RequestBody Producto producto){
        return service.save(producto);
    }

    @GetMapping("/producto/{id}")
    public Producto getProductoById(@PathVariable Long id){
        return service.findById(id);
    }
}
