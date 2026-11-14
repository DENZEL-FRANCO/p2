public class aula10_2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", 150.00, 2);
        Produto produto2 = new Produto("Mouse", 80.00, 3);

        produto1.apresentar();
        System.out.println();
        produto2.apresentar();
    }
}

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularTotal() {
        return preco * quantidade;
    }

    void apresentar() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + calcularTotal());
    }
    
}
