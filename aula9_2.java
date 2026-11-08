import java.util.Scanner;

public class aula9_2 {
    static  int somar(int a, int b) {
        return  a + b;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        int resultado = somar(n1,n2);
        System.out.println("soma" + resultado);
    }
}
