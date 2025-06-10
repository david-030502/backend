package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.DetalleVenta;
import utp.edu.pe.backend.services.IDetalleVentaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DetalleVentaService {
    @Autowired
    private IDetalleVentaService service;

    @GetMapping("/detalleVentas")
    public List<DetalleVenta>  getAll(){
        return service.getAll();
    }

    @PostMapping("/detalleVenta")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleVenta saveDetalleVenta(@RequestBody DetalleVenta detalleVenta){
        return service.save(detalleVenta);
    }

    @GetMapping("/detalleVenta/{id}")
    public DetalleVenta getDetalleVentaById(@PathVariable Long id){
        return service.findById(id);
    }
}
