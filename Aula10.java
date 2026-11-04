import javax.print.DocFlavor.STRING;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Denzel",19);
        pessoa1.aprentar();
    }
}
    class Pessoa{
        String nome;
        int idade;
    }