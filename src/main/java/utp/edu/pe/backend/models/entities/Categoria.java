package utp.edu.pe.backend.models.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {
    @Id //Define el primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia para autoincrementar el id
    private long id;
    private String descripcion;
    private String nombreCategoria;

    @JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Producto> productos;

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

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
