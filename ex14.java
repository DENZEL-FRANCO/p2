import java.util.Scanner;

public class ex14 {
    public static void main(String[]orgs) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("peso em kg");
        double peso = entrada.nextDouble();

        System.out.print("altura em metros");
        double altura = entrada.nextDouble();

        double imc = peso / (altura*altura);

        if (imc <=18.5){
            System.out.println("abaixo do peso");
        }else if (imc>18.5 && imc <=24.9){
            System.out.println("peso normal");
        }else if (imc>25 && imc<=29.9){
            System.out.println("sobrepeso");
        }else{
            System.out.println("obesidade");
        }

         entrada.close();
    }
    
}
