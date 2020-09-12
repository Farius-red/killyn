package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Cliente;
import killyn.crud.entitis.Factura;
import killyn.crud.entitis.Logistica;
import killyn.crud.entitis.Repuesto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Despacho.class)
public class Despacho_ { 

    public static volatile SingularAttribute<Despacho, String> descripcion;
    public static volatile SingularAttribute<Despacho, Date> fecha;
    public static volatile SingularAttribute<Despacho, Logistica> logisticaUsuarioId;
    public static volatile SingularAttribute<Despacho, String> despachocol;
    public static volatile SingularAttribute<Despacho, Factura> facturaId;
    public static volatile SingularAttribute<Despacho, Cliente> clienteUsuarioId;
    public static volatile SingularAttribute<Despacho, String> direccion;
    public static volatile ListAttribute<Despacho, Repuesto> repuestoList;
    public static volatile SingularAttribute<Despacho, Integer> id;
    public static volatile SingularAttribute<Despacho, Integer> cantidad;
    public static volatile SingularAttribute<Despacho, Integer> telefono;
    public static volatile SingularAttribute<Despacho, String> nombre;

}