package utp.edu.pe.backend.services;

import utp.edu.pe.backend.models.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> getAll();
    public Empleado save(Empleado empleado);
    public Empleado findById(Long id);
    public void delete(Empleado empleado);
}
