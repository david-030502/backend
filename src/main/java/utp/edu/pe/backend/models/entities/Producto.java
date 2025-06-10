package utp.edu.pe.backend.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="productos")
public class Producto {
    @Id //Atributo ID va a ser Primaey Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Atributo ID se va a autogenerar
    private Long id;
    private String nombre;
    private String descripcion;
    private float precioCosto;
    private float precioVenta;
    private boolean estado;
    private int stock;

    //Solo los setters específicados estarán en la metadata
    //@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"}, allowSetters = true)
    //Especificando la relacion entre producto y categoria
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) //fetch y cascade son restricciones, no va a dejar que se elimine una categoria si esta relacionada con un producto
    @JsonBackReference
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
