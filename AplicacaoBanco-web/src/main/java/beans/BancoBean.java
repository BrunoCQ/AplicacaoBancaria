/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Bruno
 */
@Named(value = "bancoBean")
@ApplicationScoped
public class BancoBean {
    int id_banco;
    String nome;
    /**
     * Creates a new instance of BancoBean
     */
    public BancoBean() {
    }
    
}
