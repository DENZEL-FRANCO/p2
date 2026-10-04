import  java.util.Scanner;


public class ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite sua primeira nota");
        double n1 = entrada.nextDouble();

        System.out.print("digite sua segunda nota");
        double n2 = entrada.nextDouble();

        System.out.print("digite sua terceira nota");
        double n3 = entrada.nextDouble();
        
        System.out.print("digite o oersentual de frequência (ex80): ");
        double frequencia = entrada.nextDouble();

        System.out.print("situação finaceira (1 para regular , 0 para pendente): ");
        int situacaofinaceira = entrada.nextInt();

        double media = (( n1 + n2 + n3  ) /3);

        if (media >=7.0 && frequencia >= 75.0 && situacaofinaceira == 1) {
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
            System.out.println("motivo da reprovação: ");

            if (media < 7.0) {
                System.out.println(" - média abaixo de 7 (média: " + media + "  )");
            }
            if (frequencia <75.0) {
                System.out.println("frequência abaixo de 75.0 (frequência: " + frequencia + ")");
            }
            if (situacaofinaceira == 0){
                System.out.println(" - possui pendências finaceiras");
            }
        }
         entrada.close();

    }
    
}
