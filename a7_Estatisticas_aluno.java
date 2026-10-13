import java.util.Scanner;

public class a7_Estatisticas_aluno {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos aluns serão cadastrados? ");
        int totalAlunos = entrada.nextInt();

        int maisDe15faltas = 0;

        int somaIdadesMenos5Faltas = 0;
        int totalAlunosMenos5faltas = 0;

        int maioridade = 0;
        int menoridade = 100;

         for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("\n--- Dados do Aluno " + i + " ---");
            
            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            
            System.out.print("Digite a quantidade de faltas: ");
            int faltas = entrada.nextInt();

            if (faltas >15){
                maisDe15faltas++;
            }

            if (faltas < 5) {
                somaIdadesMenos5Faltas += idade;
                totalAlunosMenos5faltas++;
            }

            if (idade > maioridade) {
                maioridade = idade;
            }

            if (idade < menoridade) {
                menoridade = idade;
            }

        }

        double mediaIdadeMenos5 = 0;
        
        if (totalAlunosMenos5faltas > 0) {
            mediaIdadeMenos5 = (double) somaIdadesMenos5Faltas / totalAlunosMenos5faltas;
        }
        
        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Alunos com mais de 15 faltas: " + maisDe15faltas);
        System.out.println("Média de idade dos alunos com menos de 5 faltas: " + mediaIdadeMenos5);
        System.out.println("Maior idade cadastrada: " + maioridade);
        System.out.println("Menor idade cadastrada: " + menoridade);

        entrada.close();
    }
    
}
