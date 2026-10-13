import  java.util.Scanner;

public class a7_notas_alunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala?");
        int totalAlunos = entrada.nextInt();

        double somanotas = 0;
        int aprovado = 0;
        double maiornota = 0;
        double menornota = 10;

        for (int i = 1; i<= totalAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ":");
            double nota = entrada.nextDouble();

            somanotas += nota;

            if (nota >= 7.0) {
                aprovado++;
            }

            if (nota > maiornota) {
                maiornota = nota;
            }

            if (nota < menornota) {
                menornota = nota;
            }
        }

        double media = somanotas / totalAlunos;

        System.out.println("\n--- Resultado final ---");
        System.out.println("Média das notas da sala: " + media);
        System.out.println("maior nota encontrada: " + maiornota);
        System.out.println("Menor nota encontrada: " + menornota);
        System.out.println("Quantidade de alunos aprovados:" + aprovado);

        entrada.close();

    }
    
}
