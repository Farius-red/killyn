package crud.entitis;

import crud.entitis.Despacho;
import crud.entitis.Factura;
import crud.entitis.Pedido;
import crud.entitis.Proveedor;
import crud.entitis.SolicitudCompraRepuesto;
import crud.entitis.TipoRepuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Repuesto.class)
public class Repuesto_ { 

    public static volatile SingularAttribute<Repuesto, Integer> estado;
    public static volatile SingularAttribute<Repuesto, Date> fechaRegistroRepuesto;
    public static volatile SingularAttribute<Repuesto, String> descripcionRepuesto;
    public static volatile SingularAttribute<Repuesto, Double> valorVenta;
    public static volatile ListAttribute<Repuesto, Factura> facturas;
    public static volatile SingularAttribute<Repuesto, Double> valorCompra;
    public static volatile SingularAttribute<Repuesto, byte[]> imagen;
    public static volatile ListAttribute<Repuesto, Pedido> pedidos;
    public static volatile ListAttribute<Repuesto, SolicitudCompraRepuesto> solicitudesCompraRepuestos;
    public static volatile ListAttribute<Repuesto, Despacho> despachos;
    public static volatile SingularAttribute<Repuesto, String> marca;
    public static volatile ListAttribute<Repuesto, Proveedor> proveedores;
    public static volatile SingularAttribute<Repuesto, Integer> id;
    public static volatile SingularAttribute<Repuesto, Integer> cantidad;
    public static volatile SingularAttribute<Repuesto, TipoRepuesto> tipoRepuesto;
    public static volatile SingularAttribute<Repuesto, String> nombreRepuesto;

}