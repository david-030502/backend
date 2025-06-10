package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Proveedor;
import utp.edu.pe.backend.services.IProveedorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProveedorController {
    @Autowired
    private IProveedorService service;

    @GetMapping("/proveedores")
    public List<Proveedor> getAll(){
        return service.getAll();
    }

    @PostMapping("/proveedor")
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedor saveProveedor(@RequestBody Proveedor proveedor){
        return service.save(proveedor);
    }

    @GetMapping("/proveedor/{id}")
    public Proveedor getCategoriaById(@PathVariable Long id){
        return service.findById(id);
    }
}
