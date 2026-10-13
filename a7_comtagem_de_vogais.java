import java.util.Scanner;

public class a7_comtagem_de_vogais {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite uma frase");
        String frase = entrada.nextLine().toLowerCase();

        String vogais = "aeiou";
        String listaEspeciais = "!@#$%¨&*()_+-=[]{}|;':/<>?0123456789";

        int quantidadevogais = 0;
        int quantidadeEspacos = 0;
        int quantidadeEpeciais = 0;
        int quantidadeconsoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (vogais.indexOf(letra) >= 0) {
                quantidadevogais++;
            }
        }

        for (int i = 0; i< frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra == ' '){
                quantidadeEspacos++;
            }
        }

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (listaEspeciais.indexOf(letra) >= 0 ) {
                quantidadeEpeciais++;
            }
        }

        quantidadeconsoantes = frase.length() - (quantidadevogais + quantidadeEspacos + quantidadeEpeciais);

        System.out.println("vogais: " + quantidadevogais);
        System.out.println("Epaços: " + quantidadeEspacos);
        System.out.println("Especiais: " + quantidadeEpeciais);
        System.out.println("consoantes: " + quantidadeconsoantes);

        entrada.close();

    }
    
}
