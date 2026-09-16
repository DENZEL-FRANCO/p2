import java.util.Scanner;

public class aula5_3 {
    public static void main(String[] orgs)  {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um número inteiro: ");
        int inteiro = entrada.nextInt();

        int antecessor = inteiro - 1;
        int sucessor = inteiro + 1;
        int dobro = inteiro + 2;
        int triplo = inteiro + 3;

        
        System.out.println("seu antecessor é: " + antecessor);
        System.out.println("seu sucessor é: " + sucessor);
        System.out.println("seu doblo é: " + dobro);
        System.out.println("seu triplo é: " + triplo);
        
        entrada.close();

    }
    
}
