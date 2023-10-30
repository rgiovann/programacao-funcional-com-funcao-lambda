import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main
{

    /**
     * BUSCA ARQUIVO (USANDO STREAMS/FUNCAO LAMBDA)
     */
    public static void main(String[] args)
    {
        String palavra = "Antonio";
        String arquivo = "nomes.txt";

        //  Usando stream e funcao lamba
        // Não necessariamente carrega, filtra e conta,
        // decide a melhor hora de fazer inclusive
        // pode fazer EM PARALELO
        // try-with-resources ira fechar automaticamente o Stream<String>
        // retornado pelo Files.lines().
        // O Stream é aberto dentro do bloco try e
        // será fechado automaticamente quando o bloco for encerrado.
        try (Stream<String> lines = Files.lines(Paths.get(arquivo), StandardCharsets.UTF_8))
        {
            long contador = lines.filter(linha -> linha.contains(palavra)).count();
            System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
        } catch (IOException e) {
            System.err.println("Ocorreu um problema ao ler o arquivo: " + e.getMessage());
        }

    }
}


