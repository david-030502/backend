package utp.edu.pe.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import utp.edu.pe.backend.models.entities.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria,Long> {
}
