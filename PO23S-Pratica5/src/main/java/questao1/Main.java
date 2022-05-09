package questao1;

//Implemente uma classe Java chamada Aluno, de acordo com a especificação abaixo:
//
//Atributos:
//  nome : String, idade : int, genero : char, ra : long
//
//Construtores:
//  construtor 1 - sem parâmetros, mas deve atribuir valores padrão para todos os atributos da classe (valores padrão: "Aluno", 18, 'M', 123456789).
//  construtor 2 - com parâmetros para atribuir valores aos atributos nome e idade.
//  construtor 3 - com parâmetros para atribuir valores aos atributos nome, genero e ra.
//  Quando o construtor não define o valor de um atributo, você deve usar o valor padrão informado no construtor 1.
//
//Método:
//  print() - imprime no console os dados do aluno, separados por " - ".
//  Observe a formatação usada nos exemplos abaixo.

public class Main {    
    public static void main(String[] args){
        //Teste 1
        Aluno a1 = new Aluno();
        a1.print();
        
        //Teste 2
        Aluno aluno2 = new Aluno("Fulana", 'F', 20232323);
        aluno2.print();
        
        //Teste 3
        Aluno aluno3 = new Aluno("Ciclano da Silva", 34);
        aluno3.print();
    }
}