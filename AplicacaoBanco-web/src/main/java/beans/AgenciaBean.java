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
    String agencia;
    /**
     * Creates a new instance of AgenciaBean
     */
    public AgenciaBean() {
        
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
   
}
