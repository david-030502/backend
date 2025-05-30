package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long> {

}
