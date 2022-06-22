package Questao3;

//Considere a classe Aluno apresentada abaixo:

//class Aluno extends Pessoa {
//    private int matricula;
//
//    public void setMatricula(int mat){
//        this.matricula = mat;
//    }
//
//    public int getMatricula(){
//        return this.matricula;
//    }
//
//    public void printDados(){
//        System.out.println(this.matricula);
//        System.out.println(this.getNome());
//        System.out.println(this.getIdade());}
//    }
//}

//Esta classe estende a classe Pessoa, que ainda não foi implementada.

public class Main {
    public static void main(String[] args) {
//        Teste 1:
        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(12345667);
        aluno1.setNome("Fulano");
        aluno1.setIdade(18);
        aluno1.printDados();

//----------------------------------------------------------------//

//        Teste 2:
//        Aluno aluno1 = new Aluno();
//        aluno1.setMatricula(12345667);
//        aluno1.setNome("Fulano");
//        aluno1.setIdade(18);
//        aluno1.printDados();
    }
}