import java.util.Scanner;

public class a7_comtagem_de_vogais {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite uma frase");
        String frase = entrada.nextLine();

        String palavra = entrada.nextLine().toLowerCase();
        String vogais = "aeiou";

        int quantidadevogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (vogais.indexOf(letra) >= 0) {
                quantidadevogais++;
            }
        }
        System.out.println("vogais: " + quantidadevogais);
    }
    
}
