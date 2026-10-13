import java.util.Scanner;

public class a8_atividade_numeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroMaximo = entrada.nextInt();

        for ( int i = numeroMaximo; i >= 0; i--){
            System.out.println(i);
        }

        System.out.println("lançamento!");

        entrada.close();
    }
    
}