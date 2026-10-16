import java.util.Scanner;


public class revisao7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite sua nota");
        double nota = entrada.nextDouble();

        if (nota >= 7.0){
            System.out.println("Aprovado");
        }else if (nota >= 5.0 && nota <=6.9) {
            System.out.println("recuperação");
        }else{
            System.out.println("reprovado");
        }

        entrada.close();

    }
    
}
