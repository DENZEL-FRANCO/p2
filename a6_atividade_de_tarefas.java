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

    }
    
}
