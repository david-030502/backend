package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.ICategoriaDAO;
import utp.edu.pe.backend.models.dao.IProductoDAO;
import utp.edu.pe.backend.models.entities.Categoria;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
    @Autowired
    private ICategoriaDAO categoriaDAO;
    @Override
    public List<Categoria> getAll(){
        List<Categoria> categorias = new ArrayList<>();
        categoriaDAO.findAll().forEach(categorias::add);
        return categorias;
    }

    @Override
    public Categoria save(Categoria categoria){
        return categoriaDAO.save(categoria);
    }

    @Override
    public Categoria findById(Long id){
        return categoriaDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Categoria categoria){
        categoriaDAO.delete(categoria);
    }
}
