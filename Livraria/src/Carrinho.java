import java.util.List;

public class Carrinho {
    public static void finalizarCompra(List<Livro> livros){
        double total = 0.0;
        System.out.println("Resumo da compra: ");
        for (Livro livro : livros){
            System.out.println(livro.mostrarDetalhes());
            total += livro.preco;
        }

        System.out.printf("Total a pagar: R$%.2f\n", total);
    }
}
