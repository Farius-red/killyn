/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Repuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IRepuestoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class RepuestoDAO extends AbstractDAO<Repuesto> implements IRepuestoDAO {

    
    public RepuestoDAO() {
        super(Repuesto.class);
    }
    
}
