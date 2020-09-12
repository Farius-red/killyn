package killyn.crud.entitis;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Pqr;
import killyn.crud.entitis.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Asesor.class)
public class Asesor_ { 

    public static volatile SingularAttribute<Asesor, Integer> estado;
    public static volatile ListAttribute<Asesor, Pqr> pqrList;
    public static volatile SingularAttribute<Asesor, Usuario> usuario;
    public static volatile SingularAttribute<Asesor, Integer> usuarioId;

}