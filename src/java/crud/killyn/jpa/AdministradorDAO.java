/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Administrador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IAdministradorDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class AdministradorDAO extends AbstractDAO<Administrador> implements IAdministradorDAO {

   

    public AdministradorDAO() {
        super(Administrador.class);
    }
    
}