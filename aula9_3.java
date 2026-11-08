import java.util.Scanner;

public class aula9_3 {
    static String verificaridade(int idade) {
        if (idade >= 18){
            return  "Você é maior de idade.";
        } else{
            return "Você é menor de idade. ";
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println(verificaridade(idade));
    }
}
