package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Compra;
import utp.edu.pe.backend.services.ICompraService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompraController {
    @Autowired
    private ICompraService service;

    @GetMapping("/compras")
    public List<Compra> getAll(){
        return service.getAll();
    }

    @PostMapping("/compra")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra saveCompra(@RequestBody Compra compra){
        return service.save(compra);
    }

    @GetMapping("/compra/{id}")
    public Compra getCompraById(@PathVariable Long id){
        return service.findById(id);
    }
}
