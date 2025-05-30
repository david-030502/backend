package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> getAll();
    public Categoria save(Categoria categoria);
    public Categoria findById(Long id);
    public void delete(Categoria categoria);
}
