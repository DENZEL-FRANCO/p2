import  java.util.Scanner;;

public class revisao2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Digite seu curso");
        String curso = entrada.nextLine();

        System.out.print("Digite a nota da A1");
        double A1 = entrada.nextDouble();

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("curso: " + curso);
        System.out.println("resultade da A1:" + A1);
    }
    
}
