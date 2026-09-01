import java.util.Scanner;

public class aula3 {

public static void main(String[] orgs){

    Scanner entrada = new Scanner(System.in);

    System.out.print("digite sua primeira nota");
    double primeira = entrada.nextDouble();

    System.out.print("digite sua seguda nota");
    double segunda = entrada.nextDouble();

    System.out.print("digite sua terceira nota");
    double terceira = entrada.nextDouble();
    double media = ((primeira + segunda + terceira) / 3);

    System.out.println("=====RESULTADO=====");

    boolean aprovado = media >= 7;

    System.out.println("média; " + media);
    System.out.println("aprovado: " + aprovado);

    entrada.close();

    }   
}
