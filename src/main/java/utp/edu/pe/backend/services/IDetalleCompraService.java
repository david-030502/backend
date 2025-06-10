package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.DetalleCompra;

import java.util.List;

public interface IDetalleCompraService {
    public List<DetalleCompra> getAll();
    public DetalleCompra save(DetalleCompra detalleCompra);
    public DetalleCompra findById(Long id);
    public void delete(DetalleCompra detalleCompra);

}
