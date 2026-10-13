import java.util.Scanner;

public class a8_validar_nota {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 10: ");
        double nota = entrada.nextDouble();

        while (nota < 0 || nota >10) {
            System.out.println("nota invalida. ");
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = entrada.nextDouble();
                
        }

    if (nota >= 7.0) {
        System.out.println("aprovado");
    } else if (nota >= 4.0) {
        System.out.println("Recuperação");
    } else {
        System.out.println("reprovado");
    }

    }
    
}
