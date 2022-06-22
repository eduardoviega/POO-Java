package questao1;

//Implemente uma classe Java chamada MinhaColecao, que encapsula um ArrayList de Strings para armazenar nomes de carros. 
//Atenção: não esqueça de adicionar os colchetes angulares ao instanciar o objeto ArrayList. Por exemplo: new ArrayList<>();;
//
//A classe MinhaColecao deve implementar métodos para adicionar, remover e imprimir os carros da coleção.
//Não é permitido armazenar nomes de carros duplicados.

public class Main {
    public static void main(String[] args) {
        MinhaColecao colecao = new MinhaColecao();
        colecao.adicionar("Fusca");
        colecao.adicionar("Gol");
        colecao.adicionar("Corsa");
        colecao.adicionar("Fusca");
        colecao.remover("Fusca");
        colecao.imprimir();
        
//        MinhaColecao colecao = new MinhaColecao();
//        colecao.adicionar("Ferrari");
//        colecao.adicionar("Ferrari");
//        colecao.adicionar("Ferrari");
//        colecao.remover("Ferrari");
//        colecao.imprimir();

//        MinhaColecao colecao = new MinhaColecao();
//        colecao.adicionar("Fiesta");
//        colecao.adicionar("Vectra");
//        colecao.adicionar("Jetta");
//        colecao.remover("Jetta");
//        colecao.remover("Vectra");
//        colecao.remover("Fiesta");
//        colecao.imprimir();
    }
}
