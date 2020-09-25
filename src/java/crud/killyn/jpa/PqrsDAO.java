/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Pqrs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IPqrsDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class PqrsDAO extends AbstractDAO<Pqrs> implements IPqrsDAO {

    
    public PqrsDAO() {
        super(Pqrs.class);
    }
    
}
