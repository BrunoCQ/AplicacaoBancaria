package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String agencia;

	@Column
	@OneToMany(mappedBy = "agencia")
	private List<Conta> contas;

	@OneToOne(mappedBy = "agencia")
	private Banco banco;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (agencia != null ? agencia.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Agencia)) {
			return false;
		}
		Agencia other = (Agencia) object;
		if ((this.agencia == null && other.agencia != null)
				|| (this.agencia != null && !this.agencia.equals(other.agencia))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entidades.Agencia[ id=" + agencia + " ]";
	}

}
