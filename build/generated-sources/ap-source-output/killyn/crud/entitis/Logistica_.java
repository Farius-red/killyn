package killyn.crud.entitis;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Despacho;
import killyn.crud.entitis.SolicitudCompraRepuestos;
import killyn.crud.entitis.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Logistica.class)
public class Logistica_ { 

    public static volatile SingularAttribute<Logistica, Integer> estado;
    public static volatile ListAttribute<Logistica, Despacho> despachoList;
    public static volatile ListAttribute<Logistica, SolicitudCompraRepuestos> solicitudCompraRepuestosList;
    public static volatile SingularAttribute<Logistica, Usuario> usuario;
    public static volatile SingularAttribute<Logistica, Integer> usuarioId;

}