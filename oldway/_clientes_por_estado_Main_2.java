import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Jose","Campinas","SP"));
        clientes.add(new Cliente("Pedro","Campinas","SP"));
        clientes.add(new Cliente("João","São Paulo","SP"));
        clientes.add(new Cliente("Ana","Recife","PE"));
        clientes.add(new Cliente("Fabiana","Campo Grande","MS"));
        clientes.add(new Cliente("Cristiane","Rio de Janeiro","RJ"));
        clientes.add(new Cliente("Fabricio","Campinas","SP"));
        clientes.add(new Cliente("Julia","Campo Grande","MS"));
        clientes.add(new Cliente("Fábio","São Paulo","SP"));

        Map<String,List<Cliente>> clientesPorEstado = agrupaPorEstado(clientes);

        for (String estado : clientesPorEstado.keySet())
        {
            System.out.println(estado + ": " + clientesPorEstado.get(estado));
        }

    }

    public static Map<String,List<Cliente>> agrupaPorEstado(List<Cliente> clientes)
    {

        return clientes.stream()
                .collect(Collectors.groupingBy(cli->cli.getEstado()));

// 1a melhoria
//           return clientes.stream()
//                  .collect(Collectors.groupingBy(Cliente::getEstado));

// 2a melhoria
//           return clientes.stream()
//                .collect(groupingBy(Cliente::getEstado));
        
    }
}