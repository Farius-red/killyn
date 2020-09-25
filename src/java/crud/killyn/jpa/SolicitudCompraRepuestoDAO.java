/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.jpa;

import crud.entitis.SolicitudCompraRepuesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import crud.killyn.DAO.ISolicitudCompraRepuestoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class SolicitudCompraRepuestoDAO extends AbstractDAO<SolicitudCompraRepuesto> implements ISolicitudCompraRepuestoDAO {

    

    public SolicitudCompraRepuestoDAO() {
        super(SolicitudCompraRepuesto.class);
    }
    
}
