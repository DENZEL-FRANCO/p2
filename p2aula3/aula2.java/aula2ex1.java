package p2aula3.aula2;

import java.util.Scanner;
import java.util.ArrayList;

public class aula2ex1 {
    public  static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> notas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número " + (i + 1) + ": ");
            notas.add(entrada.nextInt());
        }

        System.out.println("quantidade de elementos: " + notas.size());

        int primeiro = notas.get(0);
        int ultimo = notas.get(notas.size() - 1);

        System.out.println("primiro número: " + primeiro);
        System.out.println("último número: " + ultimo);

        if (primeiro >0 && ultimo >0) {
            System.out.println("primiro e último são positivos? verdadeiro");   
        } else {
            System.out.println("primeiro e último são positivos? falso");
        }

        entrada.close();
    }
    
}
