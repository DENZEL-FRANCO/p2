import  java.util.Scanner;

public class aula5_6 {
    public static  void main(String[] orgs){
       Scanner entrada = new Scanner(System.in);

       System.out.print("digite o primeiro número: ");
       int numero1 = entrada.nextInt();

       System.out.print("digite o segundo número: ");
       int numero2 = entrada.nextInt();

       if(numero1 > numero2) {
        System.out.println("o número maio é: " + numero1);
       }else if (numero2 > numero1) {
        System.out.println("o número maio é: " + numero2);
       }else{
        System.out.println("os dois númros são inguais.");
       }

       entrada.close();
    }
    
}
