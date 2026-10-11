import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class a6_atividade_dicinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        HashMap<String,  String> aluno = new HashMap<>();

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        aluno.put("nome", nome);

        System.out.print("Digite sua idade: ");
        String idade = entrada.nextLine();
        aluno.put("idade", idade);

        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();
        aluno.put("cidade", cidade);

        System.out.print("Digite sua nota: ");
        String nota = entrada.nextLine();
        aluno.put("nota", nota);

        System.out.println("Quantidade de campos prenenchidos: " + aluno.size());

        if(aluno.containsKey("nota")) {
            System.out.println("A chave 'nota' existe? verdade ");
        }else {
            System.out.println("A chave 'nota' existe? falso");
        }

        double notaNumero = Double.parseDouble(aluno.get("nota"));

        if (notaNumero >= 7.0){
            System.out.println("situação: aprovado");
        }else if (notaNumero >= 5.0 && notaNumero < 7.0){
            System.out.println("situação: reproado");
        }else{
            System.out.println("situação: reproado");
        }

        entrada.close();


    }
    
}
