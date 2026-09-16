import  java.util.Scanner; 

public class aula5_1d {
    public  static void main(String[] orgs){
        Scanner entrada  = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("=====cadastro do aluno=====");

        System.out.println(nome);
        System.out.println(idade);

        int idadefutura  = idade + 1;

        System.out.println("sua idade futura: " + idadefutura);

        entrada.close();


    }
    
}
