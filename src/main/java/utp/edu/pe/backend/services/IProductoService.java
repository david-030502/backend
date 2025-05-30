package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> getAll();
    public Producto save(Producto producto);
    public Producto findById(Long id);
    public void delete(Producto producto);
}
