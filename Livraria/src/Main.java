import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando uma Lista para armazenar objetos do tipo Livro;
        List<Livro> livros = new ArrayList<>();
        livros.add(new LivroFisico("Harry Potter e a pedra filosofal", "J.K Rowling", 40.0, 0.4));
        livros.add(new Ebook("Harry Potter e a pedra filosofal", "J.K Rowling",29.90, 4.1));
        livros.add(new LivroFisico("Harry Potter, A câmara secreta", "J.K Rowling", 47.0,0.7));
        livros.add(new Ebook("Harry Potter, A câmara secreta", "J.K Rowling", 29.90, 4.7));
        livros.add(new LivroFisico("Um dia sem reclamar ", "Marcelo Galuppo", 21.99, 0.3));
        livros.add(new Ebook("Um dia sem reclamar ", "Marcelo Galuppo", 20.89,3.2));

        System.out.println("Opções de livros: ");
        //Índice para mostrar o número ao lado de cada livro, indicando qual a "posição" dele;
        int indice = 1;

        //loop para percorrer a lista e mostrar na tela todos os livros, um por um;
        for(Livro livro : livros){
          System.out.println(indice + "- " + livro.mostrarDetalhes());
          indice++;
        }

        //Pede para o usuário digitar um número que irá referenciar a cada livro;
        System.out.println("Digite o número que indica o livro que você quer: ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        String answer = scan.nextLine();

    }

}


