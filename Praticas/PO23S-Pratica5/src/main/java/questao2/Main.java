package questao2;

//Declare uma classe chamada Pessoa, contendo:
//
//Atributos:
// - nome : String, privado.
// - altura : double, privado.
// - peso : double, privado.
//
//Construtor público:
// - um construtor para iniciar com valores todos os atributos, na seguinte ordem: nome, altura, peso.
//
//Métodos públicos:
// - get e set para todos os atributos.
//
//Observação: a implementação dos métodos get e set deve seguir o padrão Java. Por exemplo: getNome() e setNome(String nome).

public class Main {
    public static void main(String args[]){
        //Teste 1
        Pessoa p1 = new Pessoa("fulano", 1.80, 80);
        System.out.println(p1.getNome());
        System.out.println(p1.getAltura());
        System.out.println(p1.getPeso());
        
        
        System.out.println();
        
        //Teste 2
        Pessoa p2 = new Pessoa("fulano", 1.80, 80);
        p2.setNome("ciclano");
        p2.setAltura(1.60);
        p2.setPeso(60.0);
        System.out.println(p2.getNome());
        System.out.println(p2.getAltura());
        System.out.println(p2.getPeso());
    }
}
