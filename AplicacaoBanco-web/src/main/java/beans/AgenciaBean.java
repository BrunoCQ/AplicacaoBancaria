/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Bruno
 */
@Named(value = "agenciaBean")
@RequestScoped
public class AgenciaBean {
    int id_agencia;
    String nome;
    /**
     * Creates a new instance of AgenciaBean
     */
    public AgenciaBean() {
        
    }

    public int getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(int id_agencia) {
        this.id_agencia = id_agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
