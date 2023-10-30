import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José da Silva",5000.0,3,false,true);

        Predicate<Cliente> regraSalario = cli -> cli.getSalario() > 2000.0;
        Predicate<Cliente> regraTempoEmprego = cli -> cli.getTempoEmpregado() > 0;
        Predicate<Cliente> regraPagamentoEmAtraso = cli -> !cli.temPagamentosAtraso();
        Predicate<Cliente> regraSPC = cli -> !cli.temRestricoesSPC();

        avaliar(cliente,regraSalario.and(regraSPC));
        avaliar(cliente,regraSalario.and(regraTempoEmprego).and(regraSPC));
        avaliar(cliente,regraSPC.and(regraTempoEmprego).and(regraPagamentoEmAtraso));
        avaliar(cliente,regraSPC.and(regraSalario).and(regraTempoEmprego).and(regraPagamentoEmAtraso));
    }

    public static void avaliar(Cliente cli, Predicate<Cliente> regra)
    {
        String resultado = regra.test(cli) ? "aceito" : "recusado";
        System.out.println("Resultado: " + resultado);
    }
}