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
        double resultado = primeiro + segundo;
        System.out.println("resultatado da soma: " + resultado);
      }else if (operacao == 2) {
       double resultado = primeiro + segundo;
       System.out.println("resultado da subitração: " + resultado); 
      }else if (operacao == 3) {
        double resultado = primeiro + segundo;
        System.out.println("resultado da mutiplicação: " + resultado);
      }else if (operacao == 4) {
        if (segundo  != 0) {
          double resultado = primeiro / segundo;
          System.out.println("resultado da divisão: " + resultado);
        }else{
          System.out.println("erro: não é possivel dividir por zero. ");
        }
      } else {
        System.out.println("operação invalida. ");
      }

      entrada.close();

    }
    
}
