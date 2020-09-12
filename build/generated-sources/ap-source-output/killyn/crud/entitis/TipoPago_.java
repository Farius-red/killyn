package killyn.crud.entitis;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(TipoPago.class)
public class TipoPago_ { 

    public static volatile SingularAttribute<TipoPago, String> descripcion;
    public static volatile ListAttribute<TipoPago, Factura> facturaList;
    public static volatile SingularAttribute<TipoPago, Integer> id;
    public static volatile SingularAttribute<TipoPago, String> nombre;

}