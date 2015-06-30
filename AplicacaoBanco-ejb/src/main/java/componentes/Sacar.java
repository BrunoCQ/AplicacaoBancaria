/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Conta;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Bruno
 */
@Stateless
@LocalBean
public class Sacar {

    @PersistenceContext
    private EntityManager em;

    public void funcaoSacar(String conta, float valor) {
        Conta contaObj = em.getReference(Conta.class, conta);
        if (contaObj.getSaldo() >= valor) {
            float novoSaldo = contaObj.getSaldo() - valor;
            contaObj.setSaldo(novoSaldo);
            em.persist(contaObj);
            System.out.println("Saque efetuado com sucesso");
        }
        else {
            System.out.println("O limite para saque é: "+ contaObj.getSaldo());
        }
            
        /* Query query = em.createNamedQuery("buscarConta");
         query.setParameter("conta", conta);
         Conta contaObj = (Conta) query.getSingleResult();
         float novoSaldo = contaObj.getSaldo() - valor;
         contaObj.setSaldo(novoSaldo);
         */
    }
}
