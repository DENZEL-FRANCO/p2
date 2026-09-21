import  java.util.Scanner;

public class ex7 {
    public  static void main(String[] orgs){
      Scanner entrada = new Scanner(System.in);

      System.out.print("digite um número");
      int numero = entrada.nextInt();

      if (numero % 2 == 0) {
        System.out.println(" onúmero é par. ");
      }else{
        System.out.println("o número é impar. ");
      }

      entrada.close();
        
    }
    
}
