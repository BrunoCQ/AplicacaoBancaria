/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Cliente;
import java.io.Serializable;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author Bruno
 */
@Stateless
@Local
public class ClienteDao  extends GenericDao<Cliente, Serializable>{

    public ClienteDao() {
		super(Cliente.class);
	}
}
