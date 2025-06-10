package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.TipoDocumento;

public interface ITipoDocumentoDAO extends CrudRepository<TipoDocumento,Long> {
}
