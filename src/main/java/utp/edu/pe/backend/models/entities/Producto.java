package utp.edu.pe.backend.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
    @Id //Atributo ID va a ser Primaey Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Atributo ID se va a autogenerar
    private Long id;
    private String descripcion;
    private float precio;
    private int stock;



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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
