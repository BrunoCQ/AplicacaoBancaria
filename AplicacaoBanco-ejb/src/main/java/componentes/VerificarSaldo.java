/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import dao.ContaDao;
import java.math.BigDecimal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Bruno
 */
@Stateless
@LocalBean
public class VerificarSaldo  {

    
	@Inject
	private ContaDao dao;

	public void verificarSaldo(Long id, BigDecimal valor) throws SaldoNegativoException {
		
		Conta conta = dao.byId(id);
		int temSaldo = valor.compareTo(conta.getSaldo());
		
		if(temSaldo < 0) {
			throw new SaldoNegativoException();
		} else {
			// fazer metodo sacar
		}
		
	}
}
