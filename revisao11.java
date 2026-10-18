import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class revisao11 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

         for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            String nomeDigitado = entrada.nextLine(); 
            nomes.add(nomeDigitado);                 
        }

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Lista completa: " + nomes);

        System.out.println("Primeiro elemento: " + nomes.get(0));

        System.out.println("Último elemento: " + nomes.get(nomes.size() - 1));

        System.out.println("Quantidade de elementos: " + nomes.size());

        entrada.close();
    }
}
