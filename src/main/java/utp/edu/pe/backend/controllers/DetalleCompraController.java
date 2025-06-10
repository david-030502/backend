package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.DetalleCompra;
import utp.edu.pe.backend.services.IDetalleCompraService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DetalleCompraController {
    @Autowired
    private IDetalleCompraService service;

    @GetMapping("/detalleCompras")
    public List<DetalleCompra> getAll(){
        return service.getAll();
    }

    @PostMapping("/detalleCompra")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleCompra saveDetalleCompra(@RequestBody DetalleCompra detalleCompra){
        return service.save(detalleCompra);
    }

    @GetMapping("/detalleCompra/{id}")
    public DetalleCompra getDetalleCompraById(@PathVariable Long id){
        return service.findById(id);
    }
}
