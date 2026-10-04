import  java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o lado A");
        double ladoA = entrada.nextDouble();

        System.out.print("Digite o lado B");
        double ladoB = entrada.nextDouble();

        System.out.print("Digite o lado C");
        double ladoC = entrada.nextDouble();

        if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoB + ladoA) {

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("tringulo equilátero");
            }else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("tringulo isósceles");
            } else {
                System.out.println("triângulo Escaleno");
            }
        }else{
            System.out.println("os valore não formam um triângulo. ");
        }
        entrada.close();
    }
    
}
