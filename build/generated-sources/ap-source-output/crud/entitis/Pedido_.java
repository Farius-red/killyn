package crud.entitis;

import crud.entitis.Cliente;
import crud.entitis.Despacho;
import crud.entitis.Factura;
import crud.entitis.Repuesto;
import crud.entitis.SolicitudCompraRepuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> estado;
    public static volatile ListAttribute<Pedido, Repuesto> repuestos;
    public static volatile ListAttribute<Pedido, Factura> facturas;
    public static volatile SingularAttribute<Pedido, String> direccion;
    public static volatile ListAttribute<Pedido, SolicitudCompraRepuesto> solicitudesCompraRepuestos;
    public static volatile ListAttribute<Pedido, Despacho> despachos;
    public static volatile SingularAttribute<Pedido, Double> valorUnitario;
    public static volatile SingularAttribute<Pedido, Date> fecha;
    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, Double> valorIva;
    public static volatile SingularAttribute<Pedido, String> nombreCliente;
    public static volatile SingularAttribute<Pedido, Double> valorTotal;
    public static volatile SingularAttribute<Pedido, Date> fechaEntrega;
    public static volatile SingularAttribute<Pedido, String> descripcionPedido;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile SingularAttribute<Pedido, Integer> telefono;

}