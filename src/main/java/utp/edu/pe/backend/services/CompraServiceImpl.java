package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.ICompraDAO;
import utp.edu.pe.backend.models.entities.Compra;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraServiceImpl implements ICompraService{
    @Autowired
    private ICompraDAO compraDAO;

    @Override
    public List<Compra> getAll() {
        List<Compra> compras = new ArrayList<>();
        compraDAO.findAll().forEach(compras::add);
        return compras;
    }

    @Override
    public Compra save(Compra compra) {
        return compraDAO.save(compra);
    }

    @Override
    public Compra findById(Long id) {
        return compraDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Compra compra) {
        compraDAO.delete(compra);
    }
}
