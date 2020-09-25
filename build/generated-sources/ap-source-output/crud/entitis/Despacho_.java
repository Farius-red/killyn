package crud.entitis;

import crud.entitis.Cliente;
import crud.entitis.Pedido;
import crud.entitis.Repuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Despacho.class)
public class Despacho_ { 

    public static volatile SingularAttribute<Despacho, Date> fecha;
    public static volatile SingularAttribute<Despacho, Cliente> cliente;
    public static volatile SingularAttribute<Despacho, Integer> estado;
    public static volatile SingularAttribute<Despacho, String> nombreCliente;
    public static volatile ListAttribute<Despacho, Repuesto> repuestos;
    public static volatile SingularAttribute<Despacho, Pedido> pedido;
    public static volatile SingularAttribute<Despacho, String> direccionCliente;
    public static volatile SingularAttribute<Despacho, String> descripcionDespacho;
    public static volatile SingularAttribute<Despacho, Integer> id;
    public static volatile SingularAttribute<Despacho, Integer> cantidad;
    public static volatile SingularAttribute<Despacho, Integer> telefono;

}