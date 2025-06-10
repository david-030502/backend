package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IProveedorDAO;
import utp.edu.pe.backend.models.entities.Proveedor;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProveedorServiceImpl implements IProveedorService{
    @Autowired
    private IProveedorDAO proveedorDAO;

    @Override
    public List<Proveedor> getAll(){
        List<Proveedor> proveedores = new ArrayList<>();
        proveedorDAO.findAll().forEach(proveedores::add);
        return proveedores;
    }

    @Override
    public Proveedor save(Proveedor proveedor){
        return proveedorDAO.save(proveedor);
    }

    @Override
    public Proveedor findById(Long id){
        return proveedorDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Proveedor proveedor){
        proveedorDAO.delete(proveedor);
    }
}
