/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.TipoPqrs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.ITipoPqrsDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class TipoPqrsDAO extends AbstractDAO<TipoPqrs> implements ITipoPqrsDAO {

    

    public TipoPqrsDAO() {
        super(TipoPqrs.class);
    }
    
}
