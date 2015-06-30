/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Extrato;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.model.DataModel;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Bruno
 */
@Stateless
public class ExtratoEJB {
    
     @PersistenceContext
    private EntityManager em;
    private List<Extrato> extrato = (List<Extrato>) new Extrato();
    
    public DataTable obterExtrato() {
        boolean x = false;
        
        TypedQuery<Extrato> query = em.createNamedQuery("from "+ Extrato.class, Extrato.class);
		extrato = query.getResultList();
         extrato = em(Extrato.class, extrato);
         
         return (DataTable) extrato;
      

    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private List<Extrato> em(Class<Extrato> aClass, List<Extrato> extrato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
