import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite a quantidade de horas");
        double horas = entrada.nextDouble();


         System.out.print("possui cadastro? ( 1 prra Sim, 0 para não): ");
         int cadastro = entrada.nextInt();

         if (horas <= 0){
            System.out.println("quantidade dee horas invalidas. ");
         }

         double  valorbase;
         double  valorfinal;

         if (horas <= 1) {
            valorbase = 10.00;
         }else if (horas <= 3){
            valorbase = 20.00;
         }else if (horas <=5){
            valorbase = 30.00;
         }else {
            valorbase = 40.00;
         }

         if (horas > 8) {
            valorfinal = 50.00;
         }else if (cadastro == 1) {

         }else {
            valorfinal = valorbase;
            System.out.println("valor total a pagar: r$ " + valorfinal);

         }

         entrada.close();
    }
    
}
