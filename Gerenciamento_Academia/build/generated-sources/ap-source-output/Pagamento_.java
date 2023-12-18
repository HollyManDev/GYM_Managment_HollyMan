import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Funcionario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-03T08:34:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Cliente> cliente;
    public static volatile SingularAttribute<Pagamento, Date> data;
    public static volatile SingularAttribute<Pagamento, String> tipo_Pagamento;
    public static volatile SingularAttribute<Pagamento, Double> valor;
    public static volatile SingularAttribute<Pagamento, Long> id;
    public static volatile SingularAttribute<Pagamento, Funcionario> funcionario;
    public static volatile SingularAttribute<Pagamento, String> descricao;

}