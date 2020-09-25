package crud.entitis;

import crud.entitis.Pqrs;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(TipoPqrs.class)
public class TipoPqrs_ { 

    public static volatile SingularAttribute<TipoPqrs, String> nombrePQRS;
    public static volatile SingularAttribute<TipoPqrs, Integer> estado;
    public static volatile SingularAttribute<TipoPqrs, String> descripcionPQRS;
    public static volatile ListAttribute<TipoPqrs, Pqrs> pqrs;
    public static volatile SingularAttribute<TipoPqrs, Integer> id;

}