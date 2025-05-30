package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> getAll();
    public Cliente save(Cliente cliente);
    public Cliente findById(Long id);
    public void delete(Cliente cliente);
}
