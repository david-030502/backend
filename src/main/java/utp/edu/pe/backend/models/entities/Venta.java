package utp.edu.pe.backend.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serie;
    private String numeroDocumento;
    private LocalDateTime fecha;
    private double subtotal;
    private double igv;
    private double total;
    private String estado;

    @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"}, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private TipoDocumento tipoDocumento;

    @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"}, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cliente cliente;

    @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"}, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Empleado empleado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
