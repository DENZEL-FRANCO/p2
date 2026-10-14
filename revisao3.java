import  java.util.Scanner;

public class revisao3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       System.out.print("Digite o primeiro número");
       double  primeiro = entrada.nextDouble();

       System.out.print("Digite o segundo número");
       double segundo = entrada.nextDouble();

       System.out.println("soma:" + (primeiro + segundo));
       System.out.println("subtração: " + (primeiro - segundo));
       System.out.println("mutiplicação:" + (primeiro * segundo));
       System.out.println("divisão:" + (primeiro / segundo ));
    }
    
}
