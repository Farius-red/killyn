/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.TipoPago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.ITipoPagoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class TipoPagoDAO extends AbstractDAO<TipoPago> implements ITipoPagoDAO {

    

    public TipoPagoDAO() {
        super(TipoPago.class);
    }
    
}
