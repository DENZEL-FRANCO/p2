import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);  
        
        System.out.print("Digite a distância da corrida em km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite a quantitade de passageiros: ");
        int passageiros = entrada.nextInt();

        System.out.print("É horário de pico? ( 1 para sim, 0 para não): ");
        int horariopico = entrada.nextInt();

        if (distancia <= 0 || passageiros <= 0) {
            System.out.println("Dados inválidos. ");
        }else {
            double valordacorrida = 5.00 + (distancia * 2.00);

            if (horariopico == 1) {
                valordacorrida = valordacorrida * 1.30;
            }

            if (passageiros >3) {
                valordacorrida = valordacorrida + 10.00;
            }

            if (distancia > 20 ){
                valordacorrida = valordacorrida * 0.90;
            }

            System.out.println(" valor total da corrida: R$ " + valordacorrida);
        }

        entrada.close();
    }
    
}
