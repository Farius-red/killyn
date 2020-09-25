/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IClienteDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class ClienteDAO extends AbstractDAO<Cliente> implements IClienteDAO {

   

    public ClienteDAO() {
        super(Cliente.class);
    }
    
}
