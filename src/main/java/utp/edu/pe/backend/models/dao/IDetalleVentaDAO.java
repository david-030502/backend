package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.DetalleVenta;

public interface IDetalleVentaDAO extends CrudRepository<DetalleVenta, Long> {
}
