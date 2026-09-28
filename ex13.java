import  java.util.Scanner;

public class ex13 {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o usuario");
        String usuario = entrada.nextLine();

        System.out.print("digite sua senha");
        String senha = entrada.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")){
            System.out.println("login realizado com sucesso. ");
        }else{
            System.out.println("usuario ou denha está incorreto. ");
        }

        entrada.close();
    }
    
}
