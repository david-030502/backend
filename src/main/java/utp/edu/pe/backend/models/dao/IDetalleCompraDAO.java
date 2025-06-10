package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.DetalleCompra;

public interface IDetalleCompraDAO extends CrudRepository<DetalleCompra, Long> {
}
