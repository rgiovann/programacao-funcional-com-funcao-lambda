public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José da Silva",5000.0,3,false,true);

        avaliar(cliente,new RegraSalario(new RegraSPC()));

        avaliar(cliente,new RegraSalario(new RegraTempoEmpregado(new RegraSPC())));

        avaliar(cliente,
                new RegraSPC(
                     new RegraTempoEmpregado(new RegraPagamentoEmAtraso())));

        avaliar(cliente,
                new RegraSPC(
                        new RegraSalario(new RegraTempoEmpregado(new RegraPagamentoEmAtraso()))));

    }

    public static void avaliar(Cliente cli, Regra regra)
    {
        String resultado = regra.aplicar(cli) ? "aceito" : "recusado";
        System.out.println("Resultado: " + resultado);
    }
}