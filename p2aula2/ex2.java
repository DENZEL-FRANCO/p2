package p2aula2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digitea uma frase");

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
