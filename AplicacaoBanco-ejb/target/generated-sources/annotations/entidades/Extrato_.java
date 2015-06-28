package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Extrato.class)
public abstract class Extrato_ {

	public static volatile SingularAttribute<Extrato, String> tipo;
	public static volatile SingularAttribute<Extrato, Date> data;
	public static volatile SingularAttribute<Extrato, Operacao> operacao;
	public static volatile SingularAttribute<Extrato, Conta> conta;
	public static volatile SingularAttribute<Extrato, BigDecimal> valor;
	public static volatile SingularAttribute<Extrato, Long> id;

}

