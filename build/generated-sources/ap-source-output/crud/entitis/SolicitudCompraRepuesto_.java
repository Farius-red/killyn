package crud.entitis;

import crud.entitis.Logistica;
import crud.entitis.OrdenCompraRepuesto;
import crud.entitis.Pedido;
import crud.entitis.Repuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(SolicitudCompraRepuesto.class)
public class SolicitudCompraRepuesto_ { 

    public static volatile SingularAttribute<SolicitudCompraRepuesto, Date> fecha;
    public static volatile SingularAttribute<SolicitudCompraRepuesto, Integer> estado;
    public static volatile ListAttribute<SolicitudCompraRepuesto, Repuesto> repuestos;
    public static volatile SingularAttribute<SolicitudCompraRepuesto, Pedido> pedido;
    public static volatile SingularAttribute<SolicitudCompraRepuesto, Integer> id;
    public static volatile SingularAttribute<SolicitudCompraRepuesto, Integer> cantidad;
    public static volatile SingularAttribute<SolicitudCompraRepuesto, Logistica> logistica;
    public static volatile ListAttribute<SolicitudCompraRepuesto, OrdenCompraRepuesto> ordenesCompraRepuestos;

}