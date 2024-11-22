public class Ebook extends Livro {
    protected double tamanho;

    //Contrutor para classe Ebook;
    public Ebook(String titulo, String autor, double preco, double tamanho){
        super(titulo, autor, preco);
        this.tamanho = tamanho;
    }
    //Métodos getter e setter para tamanho;
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String mostrarDetalhes() {
        return "Ebook: " + titulo + "Tamanho: " + tamanho + "MB " + "preco: " + preco + " reais";
    }
}
