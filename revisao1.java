import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class revisao1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String  nome = "denzel";

        int idade = 19;

        float altura = 1.70f;

        String cidade = "joão pessoa ";

        boolean estudante = true;

        System.out.println("=== informações do usuário ===");
        System.out.println("nome:"+ nome);
        System.out.println("idade:" + idade + "anos");
        System.out.println("altura: " + altura);
        System.out.println("cidade onde mora: " + cidade);
        System.out.println("É estudante? " + (estudante ? "sim" : "não") );
 

    }
    
}
