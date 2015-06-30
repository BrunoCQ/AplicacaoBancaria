/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Conta;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bruno
 */
@Stateful
public class Transferencia {

    @PersistenceContext
    private EntityManager em;
    

    public void transferenciaInterna(String contaOrigem, String contaDestino, float valor) {
        Conta contaOri = em.find(Conta.class, contaOrigem);
        if (contaOri.getSaldo() >= valor) {
            Conta contaDest = em.find(Conta.class, contaDestino);
            if (contaDest != null) {
                float novoSaldoOri = contaOri.getSaldo() - valor;
                float novoSaldoDest = contaDest.getSaldo() + valor;
                contaOri.setSaldo(novoSaldoOri);
                contaDest.setSaldo(novoSaldoDest);
                em.persist(contaOri);
                em.persist(contaDest);
                System.out.println("Saque efetuado com sucesso");
            }
            else {
                System.out.println("Conta de destino não existe");
            }
        } else {
            System.out.println("O limite para transferencia é: " + contaOri.getSaldo());
        }
    }

}
