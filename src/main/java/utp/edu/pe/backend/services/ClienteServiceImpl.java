package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IClienteDAO;
import utp.edu.pe.backend.models.entities.Cliente;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    public List<Cliente> getAll(){

    }
}
