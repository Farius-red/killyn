package crud.entitis;

import crud.entitis.Pqrs;
import crud.entitis.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Asesor.class)
public class Asesor_ { 

    public static volatile SingularAttribute<Asesor, Integer> estado;
    public static volatile ListAttribute<Asesor, Pqrs> pqrs;
    public static volatile SingularAttribute<Asesor, Usuario> usuario;
    public static volatile SingularAttribute<Asesor, Integer> id;

}