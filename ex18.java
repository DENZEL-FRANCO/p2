import java.util.Scanner;


public class ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o ano");
        int ano = entrada.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("bissexto");
        }else {
            System.out.println("não bissexto");
        }
        entrada.close();
    }
    
}
