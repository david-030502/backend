package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.TipoUsuario;

public interface ITipoUsuarioDAO extends CrudRepository<TipoUsuario,Long> {
}
