package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Venta;

public interface IVentaDAO extends CrudRepository<Venta, Long> {
}
