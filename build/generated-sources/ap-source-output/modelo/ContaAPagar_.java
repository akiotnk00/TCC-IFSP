package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-07-08T16:10:30")
@StaticMetamodel(ContaAPagar.class)
public class ContaAPagar_ { 

    public static volatile SingularAttribute<ContaAPagar, Long> codigo;
    public static volatile SingularAttribute<ContaAPagar, String> situacao;
    public static volatile SingularAttribute<ContaAPagar, Double> valor;
    public static volatile SingularAttribute<ContaAPagar, String> codigodebarras;
    public static volatile SingularAttribute<ContaAPagar, Date> vencimento;
    public static volatile SingularAttribute<ContaAPagar, String> descricao;

}