/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Bruno
 */
@Named(value = "historicoBean")
@RequestScoped
public class HistoricoBean {
    Date data;
    float valor;
    /**
     * Creates a new instance of HistoricoBean
     */
    public HistoricoBean() {
    }
    
}
