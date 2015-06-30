/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import componentes.Sacar;
import componentes.Transferencia;
import componentes.ValidarLogin;
import componentes.VerificarSaldo;
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
@Named(value = "contaBean")
@SessionScoped
public class ContaBean implements Serializable {

    private int agencia;
    private String conta;
    private String contaDest;
    private String senha;
    private float valorSaque;

    @EJB
    ValidarLogin validarlogin;
    @EJB
    VerificarSaldo verificarSaldo;
    @EJB
    Sacar sacar;
    @EJB
    Transferencia transferencia;

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
    public String validaLogin(String conta, String senha) {
        boolean x = validarlogin.validaConta(conta, senha);
        if (x == true) {
            return "faces/sistemabancario.xhtml";
        } else {
            return "faces/welcomePrimeFaces.xhtml";
        }
    }

    public float verificarSaldo() {
        return verificarSaldo.verificarSaldo(conta);
    }

    public void saque() {
        sacar.funcaoSacar(conta, valorSaque);
    }

    public void transferenciaInt() {
        transferencia.transferenciaInterna(conta, contaDest, valorSaque);
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

    public float getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(float valorSaque) {
        this.valorSaque = valorSaque;
    }

    public String getContaDest() {
        return contaDest;
    }

    public void setContaDest(String contaDest) {
        this.contaDest = contaDest;
    }

}
