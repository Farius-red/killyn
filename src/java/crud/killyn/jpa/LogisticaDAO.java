/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Logistica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.ILogisticaDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class LogisticaDAO extends AbstractDAO<Logistica> implements ILogisticaDAO {

    

    public LogisticaDAO() {
        super(Logistica.class);
    }
    
}
