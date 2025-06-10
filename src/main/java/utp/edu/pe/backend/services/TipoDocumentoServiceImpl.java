package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.ITipoDocumentoDAO;
import utp.edu.pe.backend.models.entities.TipoDocumento;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDocumentoServiceImpl implements ITipoDocumentoService{
    @Autowired
    private ITipoDocumentoDAO documentoDAO;

    @Override
    public List<TipoDocumento> getAll() {
        List<TipoDocumento> documentos = new ArrayList<>();
        documentoDAO.findAll().forEach(documentos::add);
        return documentos;
    }

    @Override
    public TipoDocumento save(TipoDocumento documento) {
        return documentoDAO.save(documento);
    }

    @Override
    public TipoDocumento findById(Long id) {
        return documentoDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(TipoDocumento documento) {
        documentoDAO.delete(documento);
    }
}
