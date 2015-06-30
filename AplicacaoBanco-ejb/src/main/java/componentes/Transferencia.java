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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
        
        String mensagem = null; mensagem = "Transferencia realizada com sucesso";
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
                 mensagem = "Transferencia realizada com sucesso";
            }
            else {
                 mensagem = "Conta de destino não existe";
            }
        } else {
            mensagem = "O limite para transferencia é: " + contaOri.getSaldo();
    }
        
        
                    FacesContext.getCurrentInstance().
                    addMessage("formTrans", new FacesMessage(mensagem));

}}
