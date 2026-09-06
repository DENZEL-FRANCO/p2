import java.text.ListFormat.Style;
import java.util.Scanner;

public class aula3_5 {
    public static void main(String[] orgs){

        Scanner entrada = new Scanner(System.in);

        System.out.print("distacia percorrida: ");
        double distacia = entrada.nextDouble();

        System.out.print("litros comsumido: ");
        double litros = entrada.nextDouble();

        System.out.print("preço por litro: ");
        double precolitro = entrada.nextDouble();

        boolean dadosvalidos = distacia > 0
                            && litros >0
                            && litros != 0
                            && distacia != 0;
                            
        if (dadosvalidos) {
            double consumomedio = distacia / litros;
            double custototal = litros * precolitro;
            double custoporkm = custototal / distacia;

            System.out.print("consumo medio: " + consumomedio);
            System.out.print("custototal: " + custototal);
            System.out.print("custo por km: " + custoporkm);
            
        } else {
            System.out.println("Dados invalidos.");
        }

        entrada.close();
    }
    
}
