package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.Empleado;
import utp.edu.pe.backend.services.IEmpleadoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @Autowired
    private IEmpleadoService service;

    @GetMapping("/empleados")
    public List<Empleado> getAll(){
        return service.getAll();
    }

    @PostMapping("/empleado")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        return service.save(empleado);
    }

    @GetMapping("/empleado/{id}")
    public Empleado getEmpleadoById(@PathVariable Long id){
        return service.findById(id);
    }
}
