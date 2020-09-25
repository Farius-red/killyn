package crud.entitis;

import crud.entitis.Despacho;
import crud.entitis.Factura;
import crud.entitis.Pedido;
import crud.entitis.Pqrs;
import crud.entitis.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> estado;
    public static volatile ListAttribute<Cliente, Factura> facturas;
    public static volatile ListAttribute<Cliente, Pqrs> pqrs;
    public static volatile SingularAttribute<Cliente, Usuario> usuario;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile ListAttribute<Cliente, Pedido> pedidos;
    public static volatile ListAttribute<Cliente, Despacho> despachos;

}