package utp.edu.pe.backend.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tipoUsuarios")
public class TipoUsuario {
    @Id
    private long id;
    private String descripcion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
