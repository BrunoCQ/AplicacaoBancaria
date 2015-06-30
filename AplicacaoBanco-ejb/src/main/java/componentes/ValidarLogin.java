
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
   

    public boolean validaConta(String conta, String senha) {
        boolean x = false;
        Conta contaObj = em.find(Conta.class, conta);
        if (contaObj != null) {
            if (contaObj.getSenha().equals(senha)) {
                x = true;
            }
        }else {
            x = false;
        }
        return x;

    }
    
    
       public Conta obterConta(String conta) {
        boolean x = false;
        Conta contaObj = em.find(Conta.class, conta);
        if (contaObj != null) {
            return contaObj;
        } else {
            return null;
        }

    }
    
}
    /*
     Query query = em.createNamedQuery("buscaConta");
     query.setParameter("conta", conta);
     query.setParameter("senha", senha);
     this.conta = query.getResultList();
     if (this.conta == null) {
     x = false;
     } else {
     x = true;
     }
     return x;
     }
     
*/