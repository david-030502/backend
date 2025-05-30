package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente,Long> {
}
