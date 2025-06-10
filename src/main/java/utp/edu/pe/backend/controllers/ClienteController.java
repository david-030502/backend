package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Cliente;
import utp.edu.pe.backend.services.IClienteService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/clientes")
    public List<Cliente> getAll(){
        return service.getAll();
    }

    @GetMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return service.save(cliente);
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable Long id){
        return service.findById(id);
    }

}
