import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("digite sua idade");
        int idade = entrada.nextInt();

        System.out.print("digite sua altura");
        double altura = entrada.nextDouble();

        System.out.print("digite seu peso");
        double peso = entrada.nextDouble();

        System.out.print("digite sua nota da primeira prova");
        double nota = entrada.nextDouble();

        System.out.print("digite sua nota da segunda prova");
        double prova = entrada.nextDouble();

        System.out.print("digite sua quantidade de faltas");
        int faltas = entrada.nextInt();

        System.out.println("===== CADASTRO DO ALUNO =====");

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(nota);
        System.out.println(prova);
        System.out.println(faltas);

        System.out.println("===== RESULTADOS =====");

        double  media = (nota + prova) / 2;
        double  imc = peso / (altura * altura);
        
        System.out.println("media:" + media);
        System.out.println("imc: " + imc);

        entrada.close();



    }
}