import java.io.FileReader;
import java.io.BufferedReader;
public class Main {

    /**
     * BUSCA ARQUIVO (OLD WAY)
     */
    public static void main(String[] args) throws Exception {

        String palavra = "Antonio";
        String arquivo = "nomes.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))) {
            long contador = 0;      // variável em memória
            String linha = null;    // variável em memória

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.contains(palavra)) {
                    contador++;
                }
            }

            System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
        }
    }

    }
