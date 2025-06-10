package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.DetalleVenta;

import java.util.List;

public interface IDetalleVentaService {
    public List<DetalleVenta> getAll();
    public DetalleVenta save(DetalleVenta detalleVenta);
    public DetalleVenta findById(Long id);
    public void delete(DetalleVenta detalleVenta);
}
