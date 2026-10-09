import java.util.ArrayList;
import java.util.Scanner;

public class a6_analise_de_notas {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> notas = new ArrayList<> ();

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();
        System.out.print("Digite o quarto número: ");
        int n4 = scanner.nextInt();
        System.out.print("Digite o quinto número: ");
        int n5 = scanner.nextInt();

        System.out.println();

        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
        notas.add(n4);
        notas.add(n5);

        System.out.println("Há " + notas.size() + " elementos na lista.");
        System.out.println("Primeiro Número é " + notas.get(0));
        System.out.println("Último Número é "+ notas.get(notas.size() -1));

        boolean resultado1 = notas.get (0) > notas.get(notas.size() -1);
        boolean resultado2 = notas.get (0) > 0 && notas.get(notas.size() -1) > 0;

        if (resultado1){
            System.out.println("O primeiro número é maior que o último? " + resultado1);
        }
        else {
            System.out.println("O primeiro número é maior que o último? " + resultado1);
        }

        if (resultado2) {
            System.out.println("O primeiro e último são positivos? " +  resultado2);
        }
        else{
            System.out.println("O primeiro e último são positivos? " +  resultado2);
        }

        scanner.close();
    } 
    
}
