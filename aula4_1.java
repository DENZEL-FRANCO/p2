import java.util.Scanner;


public class aula4_1 {

    public static void main (String[] orge) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("digite o usuario");
        String usuario = entrada.nextLine();

        System.out.println( "digite sua senha");
        int senha = entrada.nextInt();
        
        if (usuario == "admin" && senha == 1234 ) {
            System.out.println("acesso aprovado");  
        } else {
           System.out.println("acesso negado"); 
        }

        entrada.close();
        
    }
    
}
