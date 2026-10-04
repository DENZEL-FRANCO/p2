import  java.util.Scanner;

public class ex15 {
    public static void main(String[]args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.print("distância em quilômetros");
        double quilometros = entrada.nextDouble();

        System.out.print("digite o comsumo do seu carro em km");
        double comsumomedio = entrada.nextDouble();

        System.out.print("digite o preço da gasolina por litro");
        double precogasolina = entrada.nextDouble();

        if (quilometros > 0 && comsumomedio > 0 && precogasolina >0) {


        double litrosnecessarios = quilometros / comsumomedio;
        double custototal = litrosnecessarios * precogasolina;

        System.out.println("litros necessários: " +litrosnecessarios);
        System.out.println("custo total com combustuvel: R$ " + custototal);

        }else{
            System.out.println("Dados inválidos. por favor,digite valores maior que zero.");
        }

        entrada.close();
    }
    
}
