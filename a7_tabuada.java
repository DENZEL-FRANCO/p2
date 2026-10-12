import java.util.Scanner;

public class a7_tabuada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = entrada.nextInt();

        System.out.println("tabuada do " + numero +":");

        for (int i = 1; i <=10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * 1));
        }

        entrada.close();

    }
    
}
