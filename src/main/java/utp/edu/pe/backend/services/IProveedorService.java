package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Proveedor;

import java.util.List;

public interface IProveedorService {
    public List<Proveedor> getAll();
    public Proveedor save(Proveedor proveedor);
    public Proveedor findById(Long id);
    public void delete(Proveedor proveedor);
}
