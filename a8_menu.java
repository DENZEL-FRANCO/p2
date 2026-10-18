import java.util.ArrayList;
import java.util.Scanner;

class aluno {
    String nome;
    int idade;
    String curso;
    double nota;

    public aluno(String nome, int idade, String curso, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.nota = nota;
    }
}

public class a8_menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<aluno> listaAlunos = new ArrayList<>();

        int opcao;

        do {
             System.out.println("\n--- SISTEMA DE CADASTRO ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Mostrar média da turma");
            System.out.println("4 - Mostrar aprovados");
            System.out.println("5 - Mostrar melhor aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

             if (opcao == 1) {
                System.out.println("\n--- CADASTRAR NEW ALUNO ---");
                
                System.out.print("Digite o nome do aluno: ");
                String nome = entrada.nextLine();
                
                System.out.print("Digite a idade do aluno: ");
                int idade = entrada.nextInt();
                entrada.nextLine();
                
                System.out.print("Digite o curso do aluno: ");
                String curso = entrada.nextLine();
                
                System.out.print("Digite a nota do aluno: ");
                double nota = entrada.nextDouble();
                entrada.nextLine();
                
                aluno novoAluno = new aluno(nome, idade, curso, nota);
                
                listaAlunos.add(novoAluno);
                
                System.out.println("Aluno cadastrado com sucesso!");
            }

            else if (opcao == 2){
            System.out.println("\n--- lista de alunos cadastrdos ---");

            if (listaAlunos.isEmpty()) {
                System.out.println("nenhum aluno cadastrado até o momento. ");
            }else{
                for (int i=0; i < listaAlunos.size(); i++ ){
                    aluno alunoAtual = listaAlunos.get(i);

                    System.out.println((i +1) + ". nome: " + alunoAtual.nome +
                                       " | idade: " + alunoAtual.idade +
                                       " | curso: " + alunoAtual.curso +
                                       " | nota:  " + alunoAtual.nota);


                }
            }
          }

           else if (opcao == 3) {
                System.out.println("\n--- MÉDIA DA TURMA ---");
                
                if (listaAlunos.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado. Média: 0.0");
                } else {
                    double somaNotasTurma = 0;
                    
                    for (int i = 0; i < listaAlunos.size(); i++) {
                        aluno alunoAtual = listaAlunos.get(i);
                        somaNotasTurma += alunoAtual.nota;
                    }
                    
                    double mediaTurma = somaNotasTurma / listaAlunos.size();
                    System.out.println("A média de notas da turma é: " + mediaTurma);
                }
            }
            
        } while (opcao != 0);

        System.out.println("sisstem encerrado. até logo");
        entrada.close();

    }
    
}
