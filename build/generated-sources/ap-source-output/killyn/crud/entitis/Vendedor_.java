package killyn.crud.entitis;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Factura;
import killyn.crud.entitis.OrdenCompraRepuesto;
import killyn.crud.entitis.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile ListAttribute<Vendedor, OrdenCompraRepuesto> ordenCompraRepuestoList;
    public static volatile SingularAttribute<Vendedor, Integer> estado;
    public static volatile ListAttribute<Vendedor, Factura> facturaList;
    public static volatile SingularAttribute<Vendedor, Usuario> usuario;
    public static volatile SingularAttribute<Vendedor, Integer> usuarioId;

}