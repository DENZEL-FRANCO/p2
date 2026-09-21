import java.util.Scanner;

public class ex5 {
    public static void main(String[] orgs) {
        Scanner  entrada =  new Scanner(System.in);

        System.out.println(" digite o número inteiro; ");
        double inteiro = entrada.nextDouble();

        if (inteiro > 0) {
            System.out.println("positivo");            
        }else{
            System.out.println("negativo");
        }


    }

    
}
