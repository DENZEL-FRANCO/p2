public class aula9_3 {
    static String verifieidade(int idade) {
        if (idade >= 18){
            return  "maior de idade";
        }
        else{
            return "menor de idade";
        }

    }
    public static  void main(String[] args) {
        System.out.println(verifieidade(18));
        System.out.println(verifieidade(15));
    }
    
}
