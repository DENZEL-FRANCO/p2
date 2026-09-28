import java.util.Scanner;


public class ex12 {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o valor da compra");
        double valordacompra = entrada.nextDouble();

        double persentualdedesconto;
        double valordodesconto;
        double valorfinal;

        if (valordacompra <= 100){
            persentualdedesconto = 0;
        } else if (valordacompra <= 500){
            persentualdedesconto = 10;
        }else {
            persentualdedesconto = 20; 
        }

        valordodesconto = valordacompra * persentualdedesconto / 100;
        valorfinal = valordacompra - valordodesconto;

        System.out.println("valor original: " + valordacompra);
        System.out.println("persentual de desconto: " + persentualdedesconto);
        System.out.println("valo com desconto: " + valordodesconto);
        System.out.println( "valor final da compra: " + valorfinal);

        entrada.close();
    }
    
}
