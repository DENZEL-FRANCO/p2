public class aula11_2 {
    class livro  {
        String titulo;
        String autor;
        int ano;

        livro(String titulo,String autor, int ano) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
        }

        public void aprentar(){
            System.out.println("titulo:" + titulo);
            System.out.println("autor:" + autor);
            System.out.println("ano:"+ ano);
        }
    }
    public class main {
        public static  void main(String[] args){
            livro livro1 = new livro("Dom Casmurro", "Machado de assid", 1899);
            livro livro2 = new livro("o ")
        }
    
        
    }
    
}
