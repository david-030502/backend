package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IProductoDAO;
import utp.edu.pe.backend.models.entities.Producto;

import java.util.ArrayList;
import java.util.List;

@Service //Para que sepa que esta clase es el SERVICIO
public class ProductoServiceImpl implements IProductoService {
    @Autowired //Se aplica inyección de dependencias del objeto DAO
    private IProductoDAO productoDAO;
    @Override
    public List<Producto> getAll() {
        List<Producto> productos = new ArrayList<>();
        productoDAO.findAll().forEach(productos::add);
        return productos;
    }

    @Override
    public Producto save(Producto producto) {
        return productoDAO.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Producto producto) {
        productoDAO.delete(producto);
    }
}
