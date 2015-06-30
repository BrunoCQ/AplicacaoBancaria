/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Bruno
 */
@NamedQueries({
    @NamedQuery(name = "buscarConta", query = "select c from Conta c where c.conta =:conta"),
    @NamedQuery(name="buscaConta", query="select c from Conta c where c.conta=:conta and c.senha=:senha")
})
@Entity
public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String conta;
    @Column
    private Cliente cliente;

    @Column
    private float saldo;
    
    @Column
    private String senha;

    @Column
    @OneToOne
    private Agencia agencia;

    @OneToMany
    private List<ContaInvestimento> contaInvestimentos;

    public String getConta() {
        return conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public List<ContaInvestimento> getContaInvestimentos() {
        return contaInvestimentos;
    }

    public void setContaInvestimentos(List<ContaInvestimento> contaInvestimentos) {
        this.contaInvestimentos = contaInvestimentos;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

  

 



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conta != null ? conta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.conta == null && other.conta != null) || (this.conta != null && !this.conta.equals(other.conta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Conta[ id=" + conta + " ]";
    }

}
