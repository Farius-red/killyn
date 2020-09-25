package crud.entitis;

import crud.entitis.Cliente;
import crud.entitis.Pedido;
import crud.entitis.Repuesto;
import crud.entitis.TipoPago;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Cliente> cliente;
    public static volatile SingularAttribute<Factura, Integer> estado;
    public static volatile SingularAttribute<Factura, Double> valorIva;
    public static volatile ListAttribute<Factura, Repuesto> repuestos;
    public static volatile SingularAttribute<Factura, Double> valorTotal;
    public static volatile SingularAttribute<Factura, Pedido> pedido;
    public static volatile SingularAttribute<Factura, TipoPago> tipoPago;
    public static volatile SingularAttribute<Factura, Integer> id;

}