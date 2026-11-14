public class aula10_3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 8, 7, 9);
        Aluno aluno2 = new Aluno("Bruno", 5, 6, 4);
        Aluno aluno3 = new Aluno("Carla", 3, 2, 4);

        aluno1.apresentar();
        System.out.println();
        aluno2.apresentar();
        System.out.println();
        aluno3.apresentar();
    }
}

class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    String verificarSituacao() {
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
    }
    
}
