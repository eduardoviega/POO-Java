package questao2;

//Implemente uma classe chamada Loja que encapsula um ArrayList de objetos do tipo Produto.
//A Loja deve fornecer os seguintes métodos:
// - adicionar(Produto p) --> adiciona um produto no ArrayList
// - getProdutoMaisCaro() --> retorna o produto que tem o maior preço entre os existentes.
// - getProdutoMenosCaro() --> retorna o produto que tem o menor preço entre os existentes.
//
//A classe Produto tem as seguintes características:
//
//Atributos nome:String e preco:double.
//Getters and Setters para nome e preco.
//Construtor para iniciar todos os atributos com valores.
//Obs.: a classe Produto já está implementada no código-fonte da questão.

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionar(new Produto("calça", 150.50));
        loja.adicionar(new Produto("camisa", 90.50));
        loja.adicionar(new Produto("gravata", 50.50));
        loja.adicionar(new Produto("jaqueta", 350.50));
        System.out.println("Produto mais caro: "+loja.getProdutoMaisCaro().getNome());
        System.out.println("Produto menos caro: "+loja.getProdutoMenosCaro().getNome());
        
//        Loja loja = new Loja();
//        loja.adicionar(new Produto("calça", 450.50));
//        loja.adicionar(new Produto("camisa", 90.50));
//        loja.adicionar(new Produto("gravata", 55.50));
//        loja.adicionar(new Produto("jaqueta", 50.50));
//        System.out.println("Produto mais caro: "+loja.getProdutoMaisCaro().getNome());
//        System.out.println("Produto menos caro: "+loja.getProdutoMenosCaro().getNome());
        
//        Loja loja = new Loja();
//        loja.adicionar(new Produto("calça", 150.50));
//        loja.adicionar(new Produto("camisa", 990.50));
//        loja.adicionar(new Produto("gravata", 950.50));
//        loja.adicionar(new Produto("jaqueta", 350.50));
//        System.out.println("Produto mais caro: "+loja.getProdutoMaisCaro().getNome());
//        System.out.println("Produto menos caro: "+loja.getProdutoMenosCaro().getNome());
    }
}
