package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Despacho;
import killyn.crud.entitis.Pedido;
import killyn.crud.entitis.Repuesto;
import killyn.crud.entitis.TipoPago;
import killyn.crud.entitis.Vendedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Integer> estado;
    public static volatile SingularAttribute<Factura, Double> valorIva;
    public static volatile SingularAttribute<Factura, TipoPago> tipoPagoid;
    public static volatile SingularAttribute<Factura, Pedido> pedidoId;
    public static volatile ListAttribute<Factura, Despacho> despachoList;
    public static volatile SingularAttribute<Factura, Double> valorTotal;
    public static volatile SingularAttribute<Factura, Integer> id;
    public static volatile ListAttribute<Factura, Repuesto> repuestoList;
    public static volatile SingularAttribute<Factura, Vendedor> vendedorUsuarioId;

}