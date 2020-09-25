package crud.entitis;

import crud.entitis.Asesor;
import crud.entitis.Cliente;
import crud.entitis.TipoPqrs;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Pqrs.class)
public class Pqrs_ { 

    public static volatile SingularAttribute<Pqrs, String> descripcion;
    public static volatile SingularAttribute<Pqrs, Date> fecha;
    public static volatile SingularAttribute<Pqrs, Cliente> cliente;
    public static volatile SingularAttribute<Pqrs, Integer> estado;
    public static volatile SingularAttribute<Pqrs, Asesor> asesor;
    public static volatile SingularAttribute<Pqrs, Integer> id;
    public static volatile ListAttribute<Pqrs, TipoPqrs> tiposPqrs;

}