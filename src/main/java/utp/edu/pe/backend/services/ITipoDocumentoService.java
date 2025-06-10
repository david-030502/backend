package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {
    public List<TipoDocumento> getAll();
    public TipoDocumento save(TipoDocumento documento);
    public TipoDocumento findById(Long id);
    public void delete(TipoDocumento documento);
}
