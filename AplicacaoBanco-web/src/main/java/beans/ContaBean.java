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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aíquis
 */
@Named(value = "contaBeanTeste")
@SessionScoped
public class ContaBean implements Serializable {

    private int agencia;
    private String conta;
    private String senha;
    
    @EJB
    ValidarLogin validarlogin;
    
    public ContaBean() {
    }

    /*public String login () {
    FacesContext context = FacesContext.getCurrentInstance();
    HttpServletRequest request = (HttpServletRequest) 
        context.getExternalContext().getRequest();
    try {
      request.login(this.conta, this.senha);
    } catch (ServletException e) {
      context.addMessage(null, new FacesMessage("Login failed."));
      return "error";
    }
    return "/faces/sistemabancario.xhtml";
  }*/
    
    /*Método de validação de login do cliente*/
    public String validaLogin(String conta,String senha){
        boolean x = validarlogin.validaConta(conta,senha);
        if (x == true)
            return "faces/sistemabancario.xhtml";
        else
            return "faces/welcomePrimeFaces.xhtml";
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
