/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Bruno
 */
@Stateless
public abstract class GenericDao   <T, I extends Serializable>{
	
	@PersistenceContext
	private EntityManager em;
	
	private Class<T> classe;
	
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	public void insert(T t) {
		em.persist(t);
	}
	
	public T update(T t) {
		return em.merge(t);
	}
	
	public void remove(Long id) {
		em.remove(id);
	}
	
	public T byId(Long id) {
		return em.find(classe, id);
	}
	
	public List<T> findAll() {
		TypedQuery<T> query = em.createNamedQuery("from "+ classe, classe);
		return query.getResultList();
	}

	EntityManager getEm() {
		return em;
	}
}


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

