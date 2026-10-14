import java.util.Scanner;


public class revisao5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade");
        double idade = entrada.nextDouble();

        if (idade >18){
            System.out.println("você e maior de idade");
        } else {
            System.out.println("você e menor de idade");
        }

        entrada.close();
    }
    
}
