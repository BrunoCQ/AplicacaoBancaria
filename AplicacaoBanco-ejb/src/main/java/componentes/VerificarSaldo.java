<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import dao.ContaDao;
import entidades.Conta;
import exceptions.SaldoNegativoException;
import java.math.BigDecimal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Bruno
 */
@Stateless
@LocalBean
public class VerificarSaldo  {

        @PersistenceContext
        private EntityManager em;
        
	public float verificarSaldo(String conta){ 
		Query query  = em.createNamedQuery("buscaSaldo");
                query.setParameter("conta", conta);
                return query.getFirstResult();
	}
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import dao.ContaDao;
import entidades.Conta;
import exceptions.SaldoNegativoException;
import java.math.BigDecimal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Bruno
 */
@Stateless
@LocalBean
public class VerificarSaldo  {

        @PersistenceContext
        private EntityManager em;
        
	public float verificarSaldo(String conta){ 
		Query query  = em.createNamedQuery("buscaSaldo");
                query.setParameter("conta", conta);
                return query.getFirstResult();
	}
}
>>>>>>> origin/master
