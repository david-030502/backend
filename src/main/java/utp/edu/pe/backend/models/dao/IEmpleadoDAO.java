package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Empleado;

public interface IEmpleadoDAO extends CrudRepository<Empleado,Long> {
}
