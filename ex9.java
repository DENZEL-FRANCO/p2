import  java.util.Scanner;


public class ex9 {
    public static void main(String[]orgs){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("digite sua idade");
        int idade = entrada.nextInt();

        if (idade >= 0 && idade <= 12 ) {
            System.out.println("vové e crinça.");
        } else if(idade >= 13 && idade <= 17 ) {
            System.out.println("adolesente. ");            
        }else if (idade >=18 && idade <= 59) {
            System.out.println("aduto. ");
        }else if (idade >= 60) {
            System.out.println("idoso");
        }else{
            System.out.println("idade invalida");
        }

         entrada.close();
        
    }
    
}
