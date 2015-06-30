/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import componentes.ValidarLogin;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Aíquis
 */
@Named(value = "contaBeanTeste")
@SessionScoped
public class ContaBeanTeste implements Serializable {

    private int agencia;
    private String conta;
    private String senha;
    
    @EJB
    ValidarLogin validarlogin;
    
    public ContaBeanTeste() {
    }

    /*Método de validação de login do cliente*/
    public boolean validaLogin(){
        return validarlogin.validaConta(conta,senha);
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
