package killyn.crud.entitis;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import killyn.crud.entitis.Administrado;
import killyn.crud.entitis.Asesor;
import killyn.crud.entitis.Cliente;
import killyn.crud.entitis.Logistica;
import killyn.crud.entitis.Rol;
import killyn.crud.entitis.TipoDocumento;
import killyn.crud.entitis.Vendedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-08T05:26:39")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellido2;
    public static volatile SingularAttribute<Usuario, TipoDocumento> tipoDocumentoid;
    public static volatile SingularAttribute<Usuario, Integer> estado;
    public static volatile SingularAttribute<Usuario, Vendedor> vendedor;
    public static volatile SingularAttribute<Usuario, String> apellido1;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Asesor> asesor;
    public static volatile SingularAttribute<Usuario, String> nombre2;
    public static volatile SingularAttribute<Usuario, String> nombre1;
    public static volatile SingularAttribute<Usuario, Rol> rolId;
    public static volatile SingularAttribute<Usuario, Cliente> cliente;
    public static volatile SingularAttribute<Usuario, Administrado> administrado;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, Logistica> logistica;
    public static volatile SingularAttribute<Usuario, Integer> telefono;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}