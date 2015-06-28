package entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transferencia.class)
public abstract class Transferencia_ {

	public static volatile SingularAttribute<Transferencia, Conta> contaDestino;
	public static volatile SingularAttribute<Transferencia, BigDecimal> valor;
	public static volatile SingularAttribute<Transferencia, Banco> banco;
	public static volatile SingularAttribute<Transferencia, Long> id;
	public static volatile SingularAttribute<Transferencia, Agencia> agenciaDestino;

}

