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
import javax.persistence.TypedQuery;

/**
 *
 * @author Bruno
 */
@Stateless
public class ContaDao extends GenericDao<Conta, Serializable>{

  public ContaDao() {
		super(Conta.class);
	}
	
	public List<Conta> exemploBusca(Conta conta) {
		
		String sql = "select c from Conta c where c.saldo > :valor";
		
		TypedQuery<Conta> query = getEm().createNamedQuery(sql, Conta.class);
		query.setParameter("valor", conta.getSaldo());
		return query.getResultList();
	}
}
