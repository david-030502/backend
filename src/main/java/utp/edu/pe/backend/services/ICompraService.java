package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Compra;

import java.util.List;

public interface ICompraService {
    public List<Compra> getAll();
    public Compra save(Compra compra);
    public Compra findById(Long id);
    public void delete(Compra compra);
}
