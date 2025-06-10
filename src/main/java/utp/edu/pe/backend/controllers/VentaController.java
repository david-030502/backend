package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Venta;
import utp.edu.pe.backend.services.IVentaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VentaController {
    @Autowired
    private IVentaService service;

    @GetMapping("/ventas")
    public List<Venta> getAll(){
        return service.getAll();
    }

    @PostMapping("/venta")
    public Venta saveVenta(@RequestBody Venta venta){
        return service.save(venta);
    }

    @GetMapping("/venta/{id}")
    public Venta getVentaById(@PathVariable Long id){
        return service.findById(id);
    }
}
