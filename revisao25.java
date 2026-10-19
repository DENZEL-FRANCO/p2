import java.util.ArrayList;
import java.util.List;

public class revisao25 {
    public static void main(String[]args){
        
         List<Double> notas = new ArrayList<>(List.of(7.5, 9.2, 5.8, 9.8, 8.0));
        System.out.println("Notas da lista: " + notas);

        double maiorNota = notas.get(0);

        for (double notaAtual : notas) {
            if (notaAtual > maiorNota) {
                maiorNota = notaAtual;
            }
        }

        System.out.println("A maior nota encontrada foi: " + maiorNota);
    }
    
}
