package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IDetalleCompraDAO;
import utp.edu.pe.backend.models.entities.DetalleCompra;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetalleCompraServiceImpl implements IDetalleCompraService{
    @Autowired
    private IDetalleCompraDAO detalleCompraDAO;

    @Override
    public List<DetalleCompra> getAll() {
        List<DetalleCompra> detalleCompras = new ArrayList<>();
        detalleCompraDAO.findAll().forEach(detalleCompras::add);
        return detalleCompras;
    }

    @Override
    public DetalleCompra save(DetalleCompra detalleCompra) {
        return detalleCompraDAO.save(detalleCompra);
    }

    @Override
    public DetalleCompra findById(Long id) {
        return detalleCompraDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(DetalleCompra detalleCompra) {
        detalleCompraDAO.delete(detalleCompra);
    }
}
