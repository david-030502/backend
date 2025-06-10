package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.ITipoUsuarioDAO;
import utp.edu.pe.backend.models.entities.TipoUsuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class ITipoUsuarioServiceImpl implements ITipoUsuarioService{
    @Autowired
    private ITipoUsuarioDAO usuarioDAO;

    @Override
    public List<TipoUsuario> getAll(){
        List<TipoUsuario> usuarios = new ArrayList<>();
        usuarioDAO.findAll().forEach(usuarios::add);
        return usuarios;
    }

    @Override
    public TipoUsuario save(TipoUsuario usuario){
        return usuarioDAO.save(usuario);
    }

    @Override
    public TipoUsuario findById(Long id){
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(TipoUsuario usuario){
        usuarioDAO.delete(usuario);
    }

}
