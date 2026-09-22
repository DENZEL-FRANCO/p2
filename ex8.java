
import  java.util.Scanner;

public class ex8 {
    public static  void main(String[] orgs){
      Scanner entrada = new Scanner(System.in);
      
      System.out.print(" digite o primeiro número");
      double primeiro = entrada.nextDouble();

      System.out.print("digite o segundo número");
      Double segundo = entrada.nextDouble();

      System.out.println("digite a operação desejada: ");
      System.out.println("1 - soma");
      System.out.println("2 - subitração");
      System.out.println("3 - mutiplicação");
      System.out.println("4 - divisão");
      System.out.println( "sua opção");
      int operacao = entrada.nextInt();

      if (operacao == 1) {
        System.out.println("resultatado: " + (primeiro + segundo));
      }else if (operacao == 2) {
       System.out.println("resultado: " + (primeiro - segundo)); 
      }else if (operacao == 3) {
        System.out.println("resultado: " + (primeiro * segundo));
      }else if (operacao == 4) {
          System.out.println("resultado: " + (primeiro / segundo));
        }else{
          System.out.println("operação invalida. ");
        }

      entrada.close();

    }
    
}
