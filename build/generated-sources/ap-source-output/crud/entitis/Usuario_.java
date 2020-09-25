package crud.entitis;

import crud.entitis.Administrador;
import crud.entitis.Asesor;
import crud.entitis.Cliente;
import crud.entitis.Logistica;
import crud.entitis.Rol;
import crud.entitis.Vendedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-25T00:33:49")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellido2;
    public static volatile SingularAttribute<Usuario, Integer> estado;
    public static volatile SingularAttribute<Usuario, Administrador> administrador;
    public static volatile SingularAttribute<Usuario, Vendedor> vendedor;
    public static volatile SingularAttribute<Usuario, String> apellido1;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Asesor> asesor;
    public static volatile SingularAttribute<Usuario, String> nombre2;
    public static volatile SingularAttribute<Usuario, String> nombre1;
    public static volatile SingularAttribute<Usuario, Rol> rol;
    public static volatile SingularAttribute<Usuario, String> tipoDocumento;
    public static volatile SingularAttribute<Usuario, Cliente> cliente;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, Logistica> logistica;
    public static volatile SingularAttribute<Usuario, Integer> telefono;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}