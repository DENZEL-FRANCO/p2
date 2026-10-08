package p2aula3;

import java.util.Scanner;

public class aula3 {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);

        for (int numero = 1; numero <= 3; numero++) {
            for (int multiplicador = 1; multiplicador <=5;multiplicador++) {
                System.out.println(
                    numero + "x" + multiplicador + "=" + (numero * multiplicador)
                );
            }
        }
    }
    
}
