import java.util.ArrayList;
import java.util.Scanner;


public class a6_atividade_de_tarefas {
    public static void main(String[]args) {
        Scanner entrada = new Scanner (System.in);

        ArrayList <String> tarefas = new ArrayList<> ();

        tarefas.add("pagar contas");
        tarefas.add("fazer compras");
        tarefas.add("Estudar python");
        tarefas.add("lavar louça");
        tarefas.add("Excercicios");

        System.out.println(tarefas.get(0));
        System.out.println(tarefas.get(1));
        System.out.println(tarefas.get(2));
        System.out.println(tarefas.get(3));
        System.out.println(tarefas.get(4));

        System.out.println(); 
        System.out.println("Escolha uma opção:");
        System.out.println("(R)emover por nome");
        System.out.println("(P)op por posição");
        System.out.println("(C)lear");
        System.out.println("(S)air");
        System.out.print("Opção: ");

        String opcao = entrada.next();
    
        if (opcao.equalsIgnoreCase("R")) {
            entrada.nextLine();
            System.out.print("digite o nome da tarefa para remover: ");
            String nomeRemover = entrada.nextLine();
            tarefas.remove(nomeRemover);
        }

        else if (opcao.equalsIgnoreCase("p")) {
            entrada.nextLine();
            System.out.print("digite a posição da tarefa para remover: ");
            int posicaoRemover = entrada.nextInt();
            tarefas.remove(posicaoRemover);            
        }

        else if (opcao.equalsIgnoreCase("c")) {
            tarefas.clear();
            System.out.println("Todas as tarefas foram removidas da lista!");
        }

        else if (opcao.equalsIgnoreCase("s")) {
            System.out.println("Saindo do programa...");
        }

        System.out.println();
        System.out.println("lista final: " + tarefas);
        System.out.println("quantidade de tarefas: " + tarefas.size());

        entrada.close();

    }
    
}
