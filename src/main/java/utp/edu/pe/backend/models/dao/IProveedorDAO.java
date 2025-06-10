package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Proveedor;

public interface IProveedorDAO extends CrudRepository<Proveedor,Long> {
}
