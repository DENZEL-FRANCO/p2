import java.util.Scanner;

public class aula3_2 {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.print("preço: ");
    double preço = entrada.nextDouble();

    System.out.print("Desconto:(%) ");
    double percetual = entrada.nextDouble();

    double desconto = preço * percetual / 100;
    double preçofinal = preço - desconto;

    System.out.println("Desconto" + desconto);
    System.out.println("preço final: " + preçofinal);

    entrada.close();
  }
}
