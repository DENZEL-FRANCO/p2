
import  java.util.Scanner;

public class aula4_3 {
    public static  void main(String[] orgs) {
      
      Scanner entrada = new Scanner(System.in);

      System.out.print("nota1");
      double nota1 = entrada.nextDouble();
      
      System.out.print("nota2");
      double nota2 = entrada.nextDouble();

      System.out.print("nota3");
      double nota3 = entrada.nextDouble();

      System.out.print("total de aula");
      int totalaula = entrada.nextInt();

      System.out.print("digite o número de faltas: "); 
      int faltas = entrada.nextInt();

      double media = (nota1 + nota2 + nota3) / 3;
      double porcentagemfaltas = (faltas * 100.0) / totalaula;

     String situacao;
     String  mensagem;

     if (porcentagemfaltas >25 ) {
      situacao = "reprovado";
      mensagem  = "reprovado por excesso de faltas.";
     }

    }
    
}
