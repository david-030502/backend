package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Compra;

public interface ICompraDAO extends CrudRepository<Compra, Long> {
}
