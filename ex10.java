import java.util.Scanner;


public class ex10 {
    public static void main(String[]orgs) {
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Digite o primeiro número inteiro");
        int n1 = entrada.nextInt();

        System.out.print(" Digite o segundo número inteiro");
        int n2 = entrada.nextInt();

        System.out.print(" Digite o terceiro número inteiro");
        int n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("o n1 é maio. ");
        } else if (n2 > n1 && n2 > n3 ) {
            System.out.println("o n2 é maior. ");
        } else {
            System.out.println(" o n3 é maior");
        }

        entrada.close();

    }

}