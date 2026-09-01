import java.util.Scanner;

public class aula3_3 {
  public static void main(String[] orgs){
  Scanner entrada = new Scanner(System.in);

  System.out.print("temperatura em celsius: " );
  double celsius = entrada.nextDouble();

  double fahrenheit = celsius * 9 / 5 + 32;

  System.out.println("temperatira em fahrenheit: " + fahrenheit);

  entrada.close();
   } 
}
