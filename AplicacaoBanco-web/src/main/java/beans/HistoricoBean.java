/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import componentes.ExtratoEJB;
import componentes.ValidarLogin;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Bruno
 */
@Named(value = "historicoBean")
@RequestScoped
public class HistoricoBean {
    Date dataInicio;
    Date dataFim;

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public ExtratoEJB getExtrato() {
        return extrato;
    }

    public void setExtrato(ExtratoEJB extrato) {
        this.extrato = extrato;
    }

    public ExtratoEJB getListaExtrato() {
        return ListaExtrato;
    }

    public void setListaExtrato(ExtratoEJB ListaExtrato) {
        this.ListaExtrato = ListaExtrato;
    }

    public DataTable getDados() {
        return dados;
    }

    public void setDados(DataTable dados) {
        this.dados = dados;
    }
    
    
    
    private ExtratoEJB extrato;
    
    @EJB
    ExtratoEJB ListaExtrato;
    
    private DataTable dados; 
    /**
     * Creates a new instance of HistoricoBean
     */
    public HistoricoBean() {
        extrato = new ExtratoEJB();
    }
    
    
    public DataTable BuscaDados() {
		
		try{			
			//Popular o DataModel com a consulta do banco
					
			dados = ListaExtrato.obterExtrato();
		}
		catch(Exception e){
			e.printStackTrace(); //Log do Servidor
		}
		
		return dados;
	}

}
