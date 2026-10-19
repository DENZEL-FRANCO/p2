import java.util.Scanner;

public class revisao28 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

         String senhaCorreta = "java123";

        System.out.print("Informe a senha de acesso: ");
        String senhaDigitada = entrada.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta! Tente novamente.");
            System.out.print("Informe a senha de acesso: ");
            senhaDigitada = entrada.nextLine();
        }

        System.out.println("Acesso permitido!");

        entrada.close(); 
    }
    
}
