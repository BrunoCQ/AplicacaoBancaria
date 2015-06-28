package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Agencia.class)
public abstract class Agencia_ {

	public static volatile SingularAttribute<Agencia, Banco> banco;
	public static volatile ListAttribute<Agencia, Conta> contas;
	public static volatile SingularAttribute<Agencia, String> agencia;

}

