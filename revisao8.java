import java.util.Scanner;

public class revosao8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade");
        int idade = entrada.nextInt();

        if (idade >= 0 && idade <=12){
            System.out.println("você e criaça");
        } else if (idade >= 13 && idade <=17){
            System.out.println("você e adolesnte");
        } else if (idade >= 18 && idade <=59){
            System.out.println("você e aulto");
        } else {
            System.out.println("você e idoso");
        }

        entrada.close();
    }
    
}
