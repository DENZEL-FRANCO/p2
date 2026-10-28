import java.util.ArrayList;

public class aula9 {
    static ArrayList<Integer> criarListaPares(int limite) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        return  pares;

    }

    public  static void main(String[] args) {
        System.out.println(criarListaPares(10));
    }
    
}
