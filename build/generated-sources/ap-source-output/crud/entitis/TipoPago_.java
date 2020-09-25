package crud.entitis;

import crud.entitis.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(TipoPago.class)
public class TipoPago_ { 

    public static volatile SingularAttribute<TipoPago, String> nombreTipoPago;
    public static volatile ListAttribute<TipoPago, Factura> facturas;
    public static volatile SingularAttribute<TipoPago, Integer> id;
    public static volatile SingularAttribute<TipoPago, String> descripcionTipoPago;

}