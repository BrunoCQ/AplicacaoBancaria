/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ejb.EJB;
import dao.ContaDao;
import entidades.Conta;
import componentes.VerificarSaldo;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;


@Named(value = "contaBean")
//@SessionScoped
public class ContaBeanOld implements Serializable {
	float saldo;
        String conta;
        int senha;
        String agencia;
        
        
	// Instancia o objeto automaticamente
	@EJB
	private VerificarSaldo verificarSaldo;
	
	//@Inject
	//private Conta conta;
	
    List<HistoricoBean> extrato;
    
    public float verificarSaldo() {
        return verificarSaldo.verificarSaldo(conta);
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    
    
    public void sacar() {
    	// Pegar valor da tela
    	
    	//BigDecimal saldo = conta.getSaldo();
    	
    	//BigDecimal novoSaldo = saldo - (new BigDecimal(12.0));
    	
    	//conta.setSaldo(111);
    	
    	//service.verificarSaldo(1L, valor);
    }
    
    
    /**
     * Creates a new instance of ContaBean
     
    public ContaBean() {
         extrato = new ArrayList<>();
    }

    public int getId_conta() {
        return id_conta;
    }
    
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public List<HistoricoBean> getExtrato() {
        return extrato;
    }

    public void setExtrato(List<HistoricoBean> extrato) {
        this.extrato = extrato;
    }
    
     public float consultaSaldo(){
       return saldo;
    }
    
    public void depositar (float valor) {
        saldo = saldo + valor;
       //extrato.valor = valor;
    }
    public void transferenciaInterna (int conta_origem, int conta_destino, float valor) {
      
    }
    public void sacar (float valor){
        saldo = saldo - valor;
        System.out.println("Por favor retire o dinheiro da sua impressora AJB");
    }
    */
}