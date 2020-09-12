package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Logistica;
import killyn.crud.entitis.OrdenCompraRepuesto;
import killyn.crud.entitis.Repuesto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(SolicitudCompraRepuestos.class)
public class SolicitudCompraRepuestos_ { 

    public static volatile SingularAttribute<SolicitudCompraRepuestos, Date> fecha;
    public static volatile ListAttribute<SolicitudCompraRepuestos, OrdenCompraRepuesto> ordenCompraRepuestoList;
    public static volatile SingularAttribute<SolicitudCompraRepuestos, Integer> estado;
    public static volatile SingularAttribute<SolicitudCompraRepuestos, Logistica> logisticaUsuarioId;
    public static volatile SingularAttribute<SolicitudCompraRepuestos, Repuesto> repuestoId;
    public static volatile SingularAttribute<SolicitudCompraRepuestos, Integer> id;
    public static volatile SingularAttribute<SolicitudCompraRepuestos, Integer> cantidad;

}