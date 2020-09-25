/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Rol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IRolDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class RolDAO extends AbstractDAO<Rol> implements IRolDAO {

  

    public RolDAO() {
        super(Rol.class);
    }
    
}
