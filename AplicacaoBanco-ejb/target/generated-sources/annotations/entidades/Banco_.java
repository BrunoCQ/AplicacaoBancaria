package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Banco.class)
public abstract class Banco_ {

	public static volatile SingularAttribute<Banco, String> nome;
	public static volatile SingularAttribute<Banco, Long> id;
	public static volatile ListAttribute<Banco, Agencia> agencias;

}

