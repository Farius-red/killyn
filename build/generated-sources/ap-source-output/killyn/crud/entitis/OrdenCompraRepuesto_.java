package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Repuesto;
import killyn.crud.entitis.SolicitudCompraRepuestos;
import killyn.crud.entitis.Vendedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(OrdenCompraRepuesto.class)
public class OrdenCompraRepuesto_ { 

    public static volatile SingularAttribute<OrdenCompraRepuesto, Date> fecha;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Integer> estado;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Double> valorIva;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Double> valorTotal;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Integer> id;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Integer> cantidad;
    public static volatile ListAttribute<OrdenCompraRepuesto, Repuesto> repuestoList;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Vendedor> vendedorUsuarioId;
    public static volatile SingularAttribute<OrdenCompraRepuesto, SolicitudCompraRepuestos> solicitudCompraRepuestosid;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Double> valorUnitario;

}