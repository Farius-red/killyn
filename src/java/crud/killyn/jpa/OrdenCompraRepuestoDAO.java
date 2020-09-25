/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.OrdenCompraRepuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IOrdenCompraRepuestoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class OrdenCompraRepuestoDAO extends AbstractDAO<OrdenCompraRepuesto> implements IOrdenCompraRepuestoDAO {

    
    public OrdenCompraRepuestoDAO() {
        super(OrdenCompraRepuesto.class);
    }
    
}
