package utp.edu.pe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.backend.models.dao.IEmpleadoDAO;
import utp.edu.pe.backend.models.dao.ITipoUsuarioDAO;
import utp.edu.pe.backend.models.entities.Empleado;
import utp.edu.pe.backend.models.entities.TipoUsuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
    @Autowired
    private IEmpleadoDAO empleadoDAO;

    @Autowired
    private ITipoUsuarioDAO tipoUsuarioDAO;

    @Override
    public List<Empleado> getAll() {
        List<Empleado> empleados = new ArrayList<>();
        empleadoDAO.findAll().forEach(empleados::add);
        return empleados;
    }

    @Override
    public Empleado save(Empleado empleado) {
        Long idTipoUsuario = empleado.getTipoUsuario().getId();
        TipoUsuario tipoUsuario = tipoUsuarioDAO.findById(idTipoUsuario)
                .orElseThrow(() -> new RuntimeException("Tipo de usuario no encontrado"));
        empleado.setTipoUsuario(tipoUsuario);

        return empleadoDAO.save(empleado);
    }

    @Override
    public Empleado findById(Long id) {
        return empleadoDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Empleado empleado) {
        empleadoDAO.delete(empleado);
    }
}
