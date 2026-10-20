import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
}


public class revisao31 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        List<Aluno> listaAlunos = new ArrayList<>();
        
        int opcao = 0;

        // O programa continua rodando ENQUANTO a opção não for 5
        while (opcao != 5) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Remover aluno");
            System.out.println("4 - Limpar lista");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // --- CADASTRAR ALUNO ---
                    System.out.print("Digite o nome do aluno: ");
                    String nome = entrada.nextLine();
                    
                    System.out.print("Digite a idade do aluno: ");
                    int idade = entrada.nextInt();
                    
                    System.out.print("Digite a nota do aluno: ");
                    double nota = entrada.nextDouble();
                    entrada.nextLine(); // Limpa o buffer novamente

                    // Cria o objeto aluno e adiciona na lista
                    Aluno novoAluno = new Aluno(nome, idade, nota);
                    listaAlunos.add(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    // --- LISTAR ALUNOS ---
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado no momento.");
                    } else {
                        System.out.println("\n--- LISTA DE ALUNOS ---");
                        // O 'for' percorre cada ficha de aluno dentro da lista
                        for (Aluno aluno : listaAlunos) {
                            System.out.println("Nome: " + aluno.nome + " | Idade: " + aluno.idade + " | Nota: " + aluno.nota);
                        }
                    }
                    break;

                case 3:
                    // --- REMOVER ALUNO ---
                    if (listaAlunos.isEmpty()) {
                        System.out.println("A lista já está vazia.");
                    } else {
                        System.out.print("Digite o nome exato do aluno que deseja remover: ");
                        String nomeParaRemover = entrada.nextLine();
                        
                        boolean encontrado = false;
                        // Procura o aluno pelo nome para poder deletar
                        for (int i = 0; i < listaAlunos.size(); i++) {
                            if (listaAlunos.get(i).nome.equalsIgnoreCase(nomeParaRemover)) {
                                listaAlunos.remove(i);
                                System.out.println("Aluno removido com sucesso!");
                                encontrado = true;
                                break; // Para o laço assim que remove
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("Aluno não encontrado na lista.");
                        }
                    }
                    break;

                case 4:
                    // --- LIMPAR LISTA ---
                    listaAlunos.clear(); // Esvazia a lista inteira de uma só vez
                    System.out.println("Todos os alunos foram removidos da lista!");
                    break;

                case 5:
                    // --- SAIR ---
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente um número de 1 a 5.");
                    break;
            }
        }

        entrada.close();

    }
    
}