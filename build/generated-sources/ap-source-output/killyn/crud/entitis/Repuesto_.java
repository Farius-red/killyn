package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Despacho;
import killyn.crud.entitis.Factura;
import killyn.crud.entitis.OrdenCompraRepuesto;
import killyn.crud.entitis.Pedido;
import killyn.crud.entitis.Proveedor;
import killyn.crud.entitis.SolicitudCompraRepuestos;
import killyn.crud.entitis.TipoRepuesto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Repuesto.class)
public class Repuesto_ { 

    public static volatile SingularAttribute<Repuesto, String> descripcion;
    public static volatile SingularAttribute<Repuesto, Integer> estado;
    public static volatile ListAttribute<Repuesto, Despacho> despachoList;
    public static volatile SingularAttribute<Repuesto, Date> fechaRegistroRepuesto;
    public static volatile SingularAttribute<Repuesto, Double> valorVenta;
    public static volatile SingularAttribute<Repuesto, Double> valorCompra;
    public static volatile ListAttribute<Repuesto, Pedido> pedidoList;
    public static volatile SingularAttribute<Repuesto, String> nombre;
    public static volatile ListAttribute<Repuesto, Proveedor> proveedorList;
    public static volatile SingularAttribute<Repuesto, String> marca;
    public static volatile ListAttribute<Repuesto, OrdenCompraRepuesto> ordenCompraRepuestoList;
    public static volatile ListAttribute<Repuesto, SolicitudCompraRepuestos> solicitudCompraRepuestosList;
    public static volatile SingularAttribute<Repuesto, TipoRepuesto> tipoRepuestoid;
    public static volatile ListAttribute<Repuesto, Factura> facturaList;
    public static volatile SingularAttribute<Repuesto, Integer> id;
    public static volatile SingularAttribute<Repuesto, Integer> cantidad;

}