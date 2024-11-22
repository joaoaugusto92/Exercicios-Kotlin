public abstract class Livro {
   protected String titulo;
   protected String autor;
   protected double preco;

    //Criando construtor para a classe Livro;
   public Livro(String titulo, String autor, double preco){
       this.titulo = titulo;
       this.autor = autor;
       this.preco = preco;
   }

    public abstract String mostrarDetalhes();
}
