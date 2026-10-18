import java.util.Scanner;


public class revisao10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = entrada.nextDouble();
        double novoSalario;

        // Estrutura condicional idêntica à do pseudocódigo
        if (salario < 2000) {
            novoSalario = salario + (salario * 0.15);
        } else if (salario <= 5000) {
            novoSalario = salario + (salario * 0.10);
        } else {
            novoSalario = salario + (salario * 0.05);
        }

        // Exibe o novo salário (usando printf para formatar os centavos)
        System.out.printf("O novo salário com aumento é: R$ %.2f\n", novoSalario);

        entrada.close();
    }
    
}
