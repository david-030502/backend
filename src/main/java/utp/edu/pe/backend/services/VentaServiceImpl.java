package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IVentaDAO;
import utp.edu.pe.backend.models.entities.Venta;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaServiceImpl implements IVentaService{
    @Autowired
    private IVentaDAO ventaDAO;

    @Override
    public List<Venta> getAll() {
        List<Venta> ventas = new ArrayList<>();
        ventaDAO.findAll().forEach(ventas::add);
        return ventas;
    }

    @Override
    public Venta save(Venta venta) {
        return ventaDAO.save(venta);
    }

    @Override
    public Venta findById(Long id) {
        return ventaDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Venta venta) {
        ventaDAO.delete(venta);
    }
}
