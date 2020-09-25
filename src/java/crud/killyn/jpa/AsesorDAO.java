/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Asesor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IAsesorDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class AsesorDAO extends AbstractDAO<Asesor> implements IAsesorDAO {
 

    public AsesorDAO() {
        super(Asesor.class);
    }
    
}
