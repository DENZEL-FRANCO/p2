import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class revisao12 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        List<String> frutas = new ArrayList<>(List.of("Maçã", "Banana", "Uva", "Morango", "Abacaxi"));
        System.out.println("Lista inicial: " + frutas);

        System.out.print("\nDigite o nome de uma fruta para ADICIONAR ao final: ");
        String frutaParaAdicionar = entrada.nextLine();
        frutas.add(frutaParaAdicionar);
        System.out.println("Após sua adição: " + frutas);

        frutas.add(1, "Kiwi");
        System.out.println("\n2. Após o sistema inserir 'Kiwi' na 2ª posição: " + frutas);

        System.out.print("\nDigite o nome exato da fruta que você deseja REMOVER: ");
        String frutaParaRemover = entrada.nextLine();
        frutas.remove(frutaParaRemover);
        System.out.println("Após sua remoção: " + frutas);

        frutas.remove(frutas.size() - 1);
        System.out.println("\n4. Após o sistema remover o último elemento: " + frutas);

        System.out.println("\n5. Lista final de frutas: " + frutas);

        entrada.close();


    }
    
}
