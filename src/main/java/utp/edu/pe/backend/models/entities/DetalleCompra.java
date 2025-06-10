package utp.edu.pe.backend.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "detalleCompras")
public class DetalleCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private double precio;
    private double total;

    @JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"}, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Compra compra;

    @JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"}, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Producto producto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
