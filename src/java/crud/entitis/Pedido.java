/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.entitis;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "pedido")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByNombreCliente", query = "SELECT p FROM Pedido p WHERE p.nombreCliente = :nombreCliente")
    , @NamedQuery(name = "Pedido.findByFecha", query = "SELECT p FROM Pedido p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Pedido.findByDireccion", query = "SELECT p FROM Pedido p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Pedido.findByFechaEntrega", query = "SELECT p FROM Pedido p WHERE p.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "Pedido.findByTelefono", query = "SELECT p FROM Pedido p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Pedido.findByDescripcionPedido", query = "SELECT p FROM Pedido p WHERE p.descripcionPedido = :descripcionPedido")
    , @NamedQuery(name = "Pedido.findByCantidad", query = "SELECT p FROM Pedido p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Pedido.findByValorUnitario", query = "SELECT p FROM Pedido p WHERE p.valorUnitario = :valorUnitario")
    , @NamedQuery(name = "Pedido.findByValorIva", query = "SELECT p FROM Pedido p WHERE p.valorIva = :valorIva")
    , @NamedQuery(name = "Pedido.findByValorTotal", query = "SELECT p FROM Pedido p WHERE p.valorTotal = :valorTotal")
    , @NamedQuery(name = "Pedido.findByEstado", query = "SELECT p FROM Pedido p WHERE p.estado = :estado")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "nombre_Cliente")
    private String nombreCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Size(max = 70)
    @Column(name = "descripcion_Pedido")
    private String descripcionPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Unitario")
    private double valorUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_iva")
    private double valorIva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Total")
    private double valorTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @JoinTable(name = "pedido_has_repuesto", joinColumns = {
        @JoinColumn(name = "pedido", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "repuesto", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Repuesto> repuestos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<Despacho> despachos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<Factura> facturas;
    @JoinColumn(name = "cliente", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<SolicitudCompraRepuesto> solicitudesCompraRepuestos;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Pedido(Integer id, String nombreCliente, Date fecha, String direccion, Date fechaEntrega, int telefono, int cantidad, double valorUnitario, double valorIva, double valorTotal, int estado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.direccion = direccion;
        this.fechaEntrega = fechaEntrega;
        this.telefono = telefono;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorIva = valorIva;
        this.valorTotal = valorTotal;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDescripcionPedido() {
        return descripcionPedido;
    }

    public void setDescripcionPedido(String descripcionPedido) {
        this.descripcionPedido = descripcionPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorIva() {
        return valorIva;
    }

    public void setValorIva(double valorIva) {
        this.valorIva = valorIva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Repuesto> getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(List<Repuesto> repuestos) {
        this.repuestos = repuestos;
    }

    public List<Despacho> getDespachos() {
        return despachos;
    }

    public void setDespachos(List<Despacho> despachos) {
        this.despachos = despachos;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<SolicitudCompraRepuesto> getSolicitudesCompraRepuestos() {
        return solicitudesCompraRepuestos;
    }

    public void setSolicitudesCompraRepuestos(List<SolicitudCompraRepuesto> solicitudesCompraRepuestos) {
        this.solicitudesCompraRepuestos = solicitudesCompraRepuestos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "crud.entitis.Pedido[ id=" + id + " ]";
    }
    
}
