import java.util.Scanner;

public class revisao30 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double soma = 0;

        System.out.print("Digite sua nota: ");
        double nota = entrada.nextDouble();

        while (nota != -1) {
            soma = soma + nota;
            contador++;
            
            System.out.print("Digite sua nota (ou -1 para parar): ");
            nota = entrada.nextDouble();
        }

        if (contador > 0) {
            double media = soma / contador;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Quantidade de notas: " + contador);
            System.out.println("Soma das notas: " + soma);
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        entrada.close(); 
    }
    
}
