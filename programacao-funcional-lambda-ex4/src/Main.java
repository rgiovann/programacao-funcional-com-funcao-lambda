import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("telefones-clientes.csv");

        List<TelefoneCliente> telefones = Files.lines(arquivo)
                .map(linha->linha.split(";"))
                .filter(arr -> arr[1].equals("19"))
                .map(arr-> new TelefoneCliente(arr[0],arr[1],arr[2]))
                //.filter(tel -> tel.getDdd().equals("19"))
                .toList();

        telefones.forEach(System.out::println);
    }
}