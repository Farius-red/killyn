/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IUsuarioDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class UsuarioDAO extends AbstractDAO<Usuario> implements IUsuarioDAO {

    @PersistenceContext(unitName = "KillynPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDAO() {
        super(Usuario.class);
    }
    
}
