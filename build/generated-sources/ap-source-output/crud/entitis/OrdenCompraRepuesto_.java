package crud.entitis;

import crud.entitis.SolicitudCompraRepuesto;
import crud.entitis.Vendedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(OrdenCompraRepuesto.class)
public class OrdenCompraRepuesto_ { 

    public static volatile SingularAttribute<OrdenCompraRepuesto, Date> fecha;
    public static volatile SingularAttribute<OrdenCompraRepuesto, SolicitudCompraRepuesto> solicitudCompraRepuesto;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Integer> estado;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Vendedor> vendedor;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Double> valorIva;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Double> valorTotal;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Integer> id;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Integer> cantidad;
    public static volatile SingularAttribute<OrdenCompraRepuesto, Double> valorUnitario;

}