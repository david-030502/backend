package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {
    public List<TipoUsuario> getAll();
    public TipoUsuario save(TipoUsuario usuario);
    public TipoUsuario findById(Long id);
    public void delete(TipoUsuario usuario);
}
