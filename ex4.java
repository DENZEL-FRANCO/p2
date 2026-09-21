import  java.util.Scanner;


public class ex4 {
    public  static void main(String[] orgs) {

        Scanner  entrada = new Scanner(System.in);

        System.out.print( "nota1");
        double nota1 = entrada.nextDouble();

        System.out.print("nota2");
        double nota2 = entrada.nextDouble();

        System.out.print("nota3");
        double nota3  = entrada.nextDouble();

        double media = (( nota1 + nota2 + nota3  ) /3);

        if (media >= 7) {
            System.out.println("aprovado");
        }else{
            System.out.print("reprovado");
        }
        entrada.close();
    }
    
}
