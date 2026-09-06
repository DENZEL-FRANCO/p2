import java.util.Scanner;

public class aula3_4 {
    public static void main(String[] orgs){
         
        Scanner entrada = new Scanner(System.in);

        System.out.print("nota1");
        double nota1 = entrada.nextDouble();

        System.out.print("peso1");
        double peso1 = entrada.nextDouble();

        System.out.print("nota2");
        double nota2 = entrada.nextDouble();

        System.out.print("peso2");
        double peso2 = entrada.nextDouble();

        System.out.print("nota3");
        double nota3 = entrada.nextDouble();

        System.out.print("peso3");
        double peso3 = entrada.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)
        / (peso1 + peso2 + peso3);

        boolean aprovado = media >= 7;
        boolean recuperacao = media >= 5 && media < 7;
        boolean reprovado =  media < 5;

        System.out.println("media:" + media);
        System.out.println("aprovado:" + aprovado);
        System.out.println("recuperacao:" + recuperacao);
        System.out.println("reprovado:" + reprovado);

        entrada.close();

    }
    
}
