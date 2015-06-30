<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentes;

import entidades.Conta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Aíquis
 */
@Stateless
public class ValidarLogin implements ValidarLoginLocal {

    @PersistenceContext
    private EntityManager em;
    private List<Conta> conta;
    
    public boolean validaConta(String conta, String senha){
        boolean x;
        Query query = em.createNamedQuery("buscaConta");
        query.setParameter("conta",conta);
        query.setParameter("senha", senha);
        this.conta = query.getResultList();
        if (this.conta == null)
            x = false;   
        else 
            x = true;
        return x;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentes;

import entidades.Conta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Aíquis
 */
@Stateless
public class ValidarLogin implements ValidarLoginLocal {

    @PersistenceContext
    private EntityManager em;
    private List<Conta> conta;
    
    public boolean validaConta(String conta, String senha){
        boolean x;
        Query query = em.createNamedQuery("buscaConta");
        query.setParameter("conta",conta);
        query.setParameter("senha", senha);
        this.conta = query.getResultList();
        if (this.conta == null)
            x = false;   
        else 
            x = true;
        return x;
    }
}
>>>>>>> origin/master
