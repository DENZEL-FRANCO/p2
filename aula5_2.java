import java.util.Scanner;

public class aula5_2 {
    public  static void main(String[] orgs ) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("digite a largura retangulo");
        double largura =  entrada.nextDouble();

        System.out.print("digite altura do retangulo");
        double altura = entrada.nextDouble();

        double area = largura * largura;
        double perimetro = 2 * (largura + largura);

        System.out.println(largura);
        System.out.println(altura);

        System.out.println("area do retangulo  é:" + area );
        System.out.println(" o perimetro do retangulo é: " + perimetro);

        entrada.close();

    }
    
}
