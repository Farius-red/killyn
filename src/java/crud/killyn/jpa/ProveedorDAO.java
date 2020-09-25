/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Proveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IProveedorDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class ProveedorDAO extends AbstractDAO<Proveedor> implements IProveedorDAO {

   

    public ProveedorDAO() {
        super(Proveedor.class);
    }
    
}
