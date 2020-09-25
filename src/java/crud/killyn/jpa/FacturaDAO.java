/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.Factura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.IFacturaDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class FacturaDAO extends AbstractDAO<Factura> implements IFacturaDAO {

   

    public FacturaDAO() {
        super(Factura.class);
    }
    
}
