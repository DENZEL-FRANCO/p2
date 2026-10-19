import java.util.Scanner;

public class revisao29 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        soma = soma + numero;

        while (numero != 0) {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("Soma: " + soma);

        entrada.close(); 
    }
    
}
