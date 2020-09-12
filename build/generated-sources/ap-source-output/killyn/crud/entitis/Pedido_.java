package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Cliente;
import killyn.crud.entitis.Factura;
import killyn.crud.entitis.Repuesto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, String> descripcion;
    public static volatile SingularAttribute<Pedido, Integer> estado;
    public static volatile SingularAttribute<Pedido, Cliente> clienteUsuarioId;
    public static volatile SingularAttribute<Pedido, String> direccion;
    public static volatile ListAttribute<Pedido, Repuesto> repuestoList;
    public static volatile SingularAttribute<Pedido, Double> valorUnitario;
    public static volatile SingularAttribute<Pedido, Date> fecha;
    public static volatile SingularAttribute<Pedido, Double> valorIva;
    public static volatile SingularAttribute<Pedido, Double> valorTotal;
    public static volatile SingularAttribute<Pedido, Date> fechaEntrega;
    public static volatile ListAttribute<Pedido, Factura> facturaList;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile SingularAttribute<Pedido, Integer> telefono;

}