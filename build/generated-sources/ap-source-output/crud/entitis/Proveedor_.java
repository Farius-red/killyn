package crud.entitis;

import crud.entitis.Repuesto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombreProveedor;
    public static volatile SingularAttribute<Proveedor, Integer> estado;
    public static volatile SingularAttribute<Proveedor, String> direccionProveedor;
    public static volatile ListAttribute<Proveedor, Repuesto> repuestos;
    public static volatile SingularAttribute<Proveedor, String> correoProveedor;
    public static volatile SingularAttribute<Proveedor, Integer> id;
    public static volatile SingularAttribute<Proveedor, Integer> telefonoProveedor;

}