package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conta.class)
public abstract class Conta_ {

	public static volatile SingularAttribute<Conta, Cliente> cliente;
	public static volatile SingularAttribute<Conta, String> senha;
	public static volatile ListAttribute<Conta, ContaInvestimento> contaInvestimentos;
	public static volatile SingularAttribute<Conta, String> conta;
	public static volatile SingularAttribute<Conta, Float> saldo;
	public static volatile SingularAttribute<Conta, Agencia> agencia;

}

