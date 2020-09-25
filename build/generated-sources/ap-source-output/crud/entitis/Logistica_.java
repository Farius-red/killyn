package crud.entitis;

import crud.entitis.SolicitudCompraRepuesto;
import crud.entitis.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Logistica.class)
public class Logistica_ { 

    public static volatile SingularAttribute<Logistica, Integer> estado;
    public static volatile SingularAttribute<Logistica, Usuario> usuario;
    public static volatile SingularAttribute<Logistica, Integer> id;
    public static volatile ListAttribute<Logistica, SolicitudCompraRepuesto> solicitudesCompraRepuestos;

}