package utp.edu.pe.backend.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Categoria;
import utp.edu.pe.backend.services.ICategoriaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaController {
    @Autowired
    private ICategoriaService service;

    @GetMapping("/categorias")
    public List<Categoria> getAll(){
        return service.getAll();
    }

    @PostMapping("/categoria")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria saveCategoria(@RequestBody Categoria categoria){
        return service.save(categoria);
    }

    @GetMapping("/categoria/{id}")
    public Categoria getCategoriaById(@PathVariable Long id){
        return service.findById(id);
    }
}
