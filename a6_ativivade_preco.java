import java.util.ArrayList;
import java.util.Scanner;


public class a6_ativivade_preco {
    public static void main(String[]args) {
      Scanner entrada = new Scanner (System.in);
      
      ArrayList <Double> precos = new ArrayList<> ();

      System.out.print("Digite o preço 1");
      double p1 = entrada.nextDouble();
      precos.add(p1);

      System.out.print("Digite o preço 2");
      double p2 = entrada.nextDouble();
      precos.add(p2);

      System.out.print("digite o preço 3");
      double p3 = entrada.nextDouble();
      precos.add(p3);

      System.out.println("lista atual: " + precos);
      System.out.println("quantidade: " + precos.size());

      System.out.print("digite o preço extra");
      double pExtra =entrada.nextDouble();

      System.out.print("em qual relação inserir (0-3) ");
      int posicao = entrada.nextInt();

      precos.add(posicao, pExtra);

      System.out.println("lista final: "  + precos);
      System.out.println("Quantidade:" + precos.size());

      entrada.close();
      
    }
    
}
