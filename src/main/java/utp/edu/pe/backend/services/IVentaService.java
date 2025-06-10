package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Venta;

import java.util.List;

public interface IVentaService {
    public List<Venta> getAll();
    public Venta save(Venta venta);
    public Venta findById(Long id);
    public void delete(Venta venta);
}
