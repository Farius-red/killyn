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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "repuesto")
@NamedQueries({
    @NamedQuery(name = "Repuesto.findAll", query = "SELECT r FROM Repuesto r")
    , @NamedQuery(name = "Repuesto.findById", query = "SELECT r FROM Repuesto r WHERE r.id = :id")
    , @NamedQuery(name = "Repuesto.findByFechaRegistroRepuesto", query = "SELECT r FROM Repuesto r WHERE r.fechaRegistroRepuesto = :fechaRegistroRepuesto")
    , @NamedQuery(name = "Repuesto.findByNombreRepuesto", query = "SELECT r FROM Repuesto r WHERE r.nombreRepuesto = :nombreRepuesto")
    , @NamedQuery(name = "Repuesto.findByMarca", query = "SELECT r FROM Repuesto r WHERE r.marca = :marca")
    , @NamedQuery(name = "Repuesto.findByDescripcionRepuesto", query = "SELECT r FROM Repuesto r WHERE r.descripcionRepuesto = :descripcionRepuesto")
    , @NamedQuery(name = "Repuesto.findByCantidad", query = "SELECT r FROM Repuesto r WHERE r.cantidad = :cantidad")
    , @NamedQuery(name = "Repuesto.findByValorCompra", query = "SELECT r FROM Repuesto r WHERE r.valorCompra = :valorCompra")
    , @NamedQuery(name = "Repuesto.findByValorVenta", query = "SELECT r FROM Repuesto r WHERE r.valorVenta = :valorVenta")
    , @NamedQuery(name = "Repuesto.findByEstado", query = "SELECT r FROM Repuesto r WHERE r.estado = :estado")})
public class Repuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_Registro_Repuesto")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistroRepuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_Repuesto")
    private String nombreRepuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "descripcion_repuesto")
    private String descripcionRepuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Compra")
    private double valorCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Venta")
    private double valorVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @JoinTable(name = "despacho_has_repuesto", joinColumns = {
        @JoinColumn(name = "repuesto", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "despacho", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Despacho> despachos;
    @JoinTable(name = "factura_has_repuesto", joinColumns = {
        @JoinColumn(name = "repuesto", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "factura", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Factura> facturas;
    @JoinTable(name = "pedido_has_repuesto", joinColumns = {
        @JoinColumn(name = "repuesto", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "pedido", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Pedido> pedidos;
    @JoinTable(name = "solicitud_compra_repuestos_has_repuesto", joinColumns = {
        @JoinColumn(name = "repuesto", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "solicitud_compra_repuesto", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<SolicitudCompraRepuesto> solicitudesCompraRepuestos;
    @JoinTable(name = "repuesto_has_proveedor", joinColumns = {
        @JoinColumn(name = "repuesto", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "proveedor", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Proveedor> proveedores;
    @JoinColumn(name = "tipo_Repuesto", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoRepuesto tipoRepuesto;

    public Repuesto() {
    }

    public Repuesto(Integer id) {
        this.id = id;
    }

    public Repuesto(Integer id, Date fechaRegistroRepuesto, String nombreRepuesto, String marca, byte[] imagen, String descripcionRepuesto, int cantidad, double valorCompra, double valorVenta, int estado) {
        this.id = id;
        this.fechaRegistroRepuesto = fechaRegistroRepuesto;
        this.nombreRepuesto = nombreRepuesto;
        this.marca = marca;
        this.imagen = imagen;
        this.descripcionRepuesto = descripcionRepuesto;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaRegistroRepuesto() {
        return fechaRegistroRepuesto;
    }

    public void setFechaRegistroRepuesto(Date fechaRegistroRepuesto) {
        this.fechaRegistroRepuesto = fechaRegistroRepuesto;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcionRepuesto() {
        return descripcionRepuesto;
    }

    public void setDescripcionRepuesto(String descripcionRepuesto) {
        this.descripcionRepuesto = descripcionRepuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<SolicitudCompraRepuesto> getSolicitudesCompraRepuestos() {
        return solicitudesCompraRepuestos;
    }

    public void setSolicitudesCompraRepuestos(List<SolicitudCompraRepuesto> solicitudesCompraRepuestos) {
        this.solicitudesCompraRepuestos = solicitudesCompraRepuestos;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public TipoRepuesto getTipoRepuesto() {
        return tipoRepuesto;
    }

    public void setTipoRepuesto(TipoRepuesto tipoRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
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
        if (!(object instanceof Repuesto)) {
            return false;
        }
        Repuesto other = (Repuesto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "crud.entitis.Repuesto[ id=" + id + " ]";
    }
    
}
