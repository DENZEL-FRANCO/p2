import java.util.ArrayList;
import java.util.Scanner;

public class a8_SomaMediaSentinela {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> listaNotas = new ArrayList<>();

        double somaNotas = 0;
        int aprovados = 0;
        double maiorNota = 0;
        double menorNota = 10; 

        System.out.print("Digite uma nota (ou um número negativo para encerrar): ");
        double nota = entrada.nextDouble();

        while (nota >= 0) {
            listaNotas.add(nota);
            
        
            System.out.print("Digite uma nota (ou um número negativo para encerrar): ");
            nota = entrada.nextDouble();
        }

        for (int i = 0; i < listaNotas.size(); i++) {
            double notaAtual = listaNotas.get(i); // Pega a nota da posição atual da lista

            somaNotas += notaAtual; // Vai acumulando a soma de todas as notas

            // 1. Checagem de Aprovados
            if (notaAtual >= 7.0) {
                aprovados++;
            }

            // 2. Descobrindo a Maior Nota
            if (notaAtual > maiorNota) {
                maiorNota = notaAtual;
            }

            // 3. Descobrindo a Menor Nota
            if (notaAtual < menorNota) {
                menorNota = notaAtual;
            }
        }

        double media = 0;
        
        // Proteção para o programa não quebrar se o usuário digitar um número negativo logo de primeira
        if (listaNotas.size() > 0) {
            media = somaNotas / listaNotas.size();
        }

        // 2. Exibe o relatório com os resultados na tela
        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Quantidade de notas válidas: " + listaNotas.size());
        System.out.println("Soma de todas as notas: " + somaNotas);
        System.out.println("Média das notas: " + media);
        System.out.println("Maior nota encontrada: " + maiorNota);
        System.out.println("Menor nota encontrada: " + menorNota);
        System.out.println("Quantidade de aprovados (nota >= 7): " + aprovados);

        entrada.close();

    }
    
}
