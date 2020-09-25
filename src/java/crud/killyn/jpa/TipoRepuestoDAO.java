/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.TipoRepuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.ITipoRepuestoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class TipoRepuestoDAO extends AbstractDAO<TipoRepuesto> implements ITipoRepuestoDAO {

    @PersistenceContext(unitName = "KillynPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoRepuestoDAO() {
        super(TipoRepuesto.class);
    }
    
}
