package killyn.crud.entitis;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Despacho;
import killyn.crud.entitis.Pedido;
import killyn.crud.entitis.Pqr;
import killyn.crud.entitis.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> estado;
    public static volatile ListAttribute<Cliente, Despacho> despachoList;
    public static volatile ListAttribute<Cliente, Pqr> pqrList;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;
    public static volatile SingularAttribute<Cliente, Usuario> usuario;
    public static volatile SingularAttribute<Cliente, Integer> usuarioId;

}