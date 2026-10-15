import java.util.Scanner;

public class revisao6 {
    public static  void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if ( numero >0 ) {
            System.out.println(" o número é: positivo");
        } else if (numero <0 ) {
            System.out.println("o número é: negativo");
        } else {
            System.out.println("o número é: igual a zero");
        }

        entrada.close();
    }
    
}
