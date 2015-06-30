/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Conta;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Bruno
 */
@Stateless
public class ContaDao extends GenericDao<Conta, Serializable> {

    @PersistenceContext
    private EntityManager em;

    public ContaDao() {
        super(Conta.class);
    }
    
    public List<Conta> exemploBusca(Conta conta) {

        String sql = "select c from Conta c where c.saldo > :valor";

        TypedQuery<Conta> query = getEm().createNamedQuery(sql, Conta.class);
        query.setParameter("valor", conta.getSaldo());
        return query.getResultList();
        
    }
    
    public float buscaSaldo (String agencia, String conta) {
    Query query = em.createNamedQuery("buscaSaldo");
    float saldo = query.getFirstResult();
    return saldo;
}
}