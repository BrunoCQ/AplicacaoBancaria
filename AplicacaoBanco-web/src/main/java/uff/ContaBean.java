/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Bruno
 */
@Named(value = "contaBean")
@SessionScoped
public class ContaBean implements Serializable {
    private double saldo;
    
    /**
     * Creates a new instance of ContaBean
     */
    public ContaBean() {
    }
    
}
