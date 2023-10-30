import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    /**
     * BUSCA ARQUIVO (OLD WAY)
     */
    public static void main(String[] args) throws Exception {

        String palavra = "Antonio";
        String arquivo = "nomes.txt";

        long contador = 0;
        List<String> linhas = Files.readAllLines(Paths.get(arquivo), StandardCharsets.UTF_8);

        for( String linha:linhas) {
            if( linha.contains(palavra)) {
                contador++;
            }
        }
            System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
        }
    }


