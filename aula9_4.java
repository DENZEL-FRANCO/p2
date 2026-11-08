import java.util.Scanner;

public class aula9_4 {
static void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.println();
        mostrarTabuada(numero);
    }
}
