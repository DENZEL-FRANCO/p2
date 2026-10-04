import java.util.Scanner;


public class ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o valor que deseja sacar");
        int valor = entrada.nextInt();

        if (valor <=0 || valor % 10 != 0){
            System.out.println("valor ivalido para saque. ");
        }else {
            int notas100 = valor / 100;
            valor = valor % 100;

            int notas50 = valor / 50;
            valor = valor % 50;

            int notas20 = valor / 20;
            valor = valor % 20;

            int notas10 = valor / 10;
            valor = valor % 10;

            System.out.println("Notas de R$ 100: " + notas100);
            System.out.println("Notas de R$ 50: " + notas50);
            System.out.println("Notas de R$ 20: " + notas20);
            System.out.println("Notas de R$ 10: " + notas10);

        }

        entrada.close();
    }
    
}
