package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IClienteDAO;
import utp.edu.pe.backend.models.entities.Cliente;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    public List<Cliente> getAll(){
        List<Cliente> clientes = new ArrayList<>();
        clienteDAO.findAll().forEach(clientes::add);
        return clientes;
    }

    @Override
    public Cliente save(Cliente cliente){
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente findById(Long id){
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente){
        clienteDAO.delete(cliente);
    }
}
