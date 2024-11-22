public class LivroFisico extends Livro {
    protected double peso;

    public LivroFisico(String titulo, String autor, double preco, double peso){
        super(titulo, autor, preco);
        this.peso = peso;
    }
    public String mostrarDetalhes(){
        return "Livro Físico: " + titulo + "autor: " + autor + "pesando: " + peso + "KG";
    }
}

