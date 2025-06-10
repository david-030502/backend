package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IDetalleVentaDAO;
import utp.edu.pe.backend.models.entities.DetalleVenta;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{
    @Autowired
    private IDetalleVentaDAO detalleVentaDAO;

    @Override
    public List<DetalleVenta> getAll() {
        List<DetalleVenta> detalleVentas = new ArrayList<>();
        detalleVentaDAO.findAll().forEach(detalleVentas::add);
        return detalleVentas;
    }

    @Override
    public DetalleVenta save(DetalleVenta detalleVenta) {
        return detalleVentaDAO.save(detalleVenta);
    }

    @Override
    public DetalleVenta findById(Long id) {
        return detalleVentaDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(DetalleVenta detalleVenta) {
        detalleVentaDAO.delete(detalleVenta);
    }
}
