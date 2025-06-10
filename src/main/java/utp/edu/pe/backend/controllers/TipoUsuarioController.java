package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.TipoUsuario;
import utp.edu.pe.backend.services.ITipoUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoUsuarioController {
    @Autowired
    private ITipoUsuarioService service;

    @GetMapping("/usuarios")
    public List<TipoUsuario> getAll(){
        return service.getAll();
    }

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoUsuario saveTipoUsuario(@RequestBody TipoUsuario usuario){
        return service.save(usuario);
    }

    @GetMapping("/usuario/{id}")
    public TipoUsuario getTipoUsuarioById(@PathVariable Long id){
        return service.findById(id);
    }
}
