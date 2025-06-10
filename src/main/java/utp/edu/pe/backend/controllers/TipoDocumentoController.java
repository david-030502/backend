package utp.edu.pe.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import utp.edu.pe.backend.models.entities.TipoDocumento;
import utp.edu.pe.backend.services.ITipoDocumentoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoController {
    @Autowired
    private ITipoDocumentoService service;

    @GetMapping("/documentos")
    public List<TipoDocumento> getAll(){
        return service.getAll();
    }

    @PostMapping("/documento")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDocumento saveTipoDocumento(@RequestBody TipoDocumento documento){
        return service.save(documento);
    }

    @GetMapping("/documento/{id}")
    public TipoDocumento getTipoDocumentoById(@PathVariable Long id){
        return service.findById(id);
    }
}
