import java.util.ArrayList;
import java.util.List;


public class revisao12 {
    public static void main(String[]args){

        List<String> frutas = new ArrayList<>(List.of("Maçã", "Banana", "Uva", "Morango", "Abacaxi"));

        System.out.println("Lista inicial: " + frutas);

        frutas.add("Melancia");
        System.out.println("adicionar a fruta: " + frutas);

        frutas.add(1, "Kiwi");
        System.out.println("adicionar a fruta em uma posição: " + frutas);

        frutas.remove("Uva");
        System.out.println("remover fruta: " + frutas);

        frutas.remove(frutas.size() - 1);
        System.out.println("remover o último: " + frutas);

        System.out.println("Lista final de frutas: " + frutas);

    }
    
}
