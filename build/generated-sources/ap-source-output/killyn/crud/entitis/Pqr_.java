package killyn.crud.entitis;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Asesor;
import killyn.crud.entitis.Cliente;
import killyn.crud.entitis.TipoPQRS;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Pqr.class)
public class Pqr_ { 

    public static volatile SingularAttribute<Pqr, String> descripcion;
    public static volatile SingularAttribute<Pqr, Date> fecha;
    public static volatile SingularAttribute<Pqr, Integer> estado;
    public static volatile SingularAttribute<Pqr, Cliente> clienteUsuarioId;
    public static volatile ListAttribute<Pqr, TipoPQRS> tipoPQRSList;
    public static volatile SingularAttribute<Pqr, Integer> id;
    public static volatile SingularAttribute<Pqr, Asesor> asesorUsuarioId;

}