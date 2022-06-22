package questao2;

//Observe o código fonte das classes abaixo:
//
//public class Pessoa {
//   private String nome;
//   public String getNome() {  return nome; }
//   public void setNome(String nome) { this.nome = nome; }
//}
//
//public abstract class Aluno extends Pessoa {
//    private int ra;
//    private double notaDisciplinas;
//
//    public abstract double getNotaFinal();
//
//    public int getRa() { return ra; }
//    public void setRa(int ra) { this.ra = ra; }
//    public double getNotaDisciplinas() { return notaDisciplinas; }
//    public void setNotaDisciplinas(double notaDisciplinas) { this.notaDisciplinas = notaDisciplinas; }
//}
//
//Implemente as classes AlunoGraduacao e AlunoMestrado, que herdam de Aluno, atendendo ao que se pede abaixo:
//
//Atributos:
// - AlunoGraduacao tem o atributo notaTCC do tipo double.
// - AlunoMestrado tem os atributos notaDissertacao do tipo double e artigosPublicados do tipo inteiro.
//
//Construtores:
// - Ambas as classes têm construtor para inicializar os atributos.
// - Siga a ordem dos atributos estabelecida no caso de teste abaixo.
//
//Métodos:
// - Implemente get e set para todos os atributos.
// - Defina a implementação do método getNotaFinal(), de acordo com as seguintes regras:
//    - AlunoGraduacao: a nota final é composta pela média aritmética simples entre a nota das disciplinas e nota do TCC.
//    - AlunoMestrado: a nota final é composta pela média aritmética simples entre a nota das disciplinas e nota da dissertação. 
//      No entanto, se o aluno não publicou artigos a nota deve ser 0 (zero).
//
//A sua implementação deve atender aos casos de teste abaixo:

public class Main {
    public static void main(String[] args) {
//        Teste 1:
        Aluno alunos[] = new Aluno[4];
        alunos[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0); // nome, ra, notadisciplinas, notatcc
        alunos[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
        alunos[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0); // nome, ra, notadisciplinas, notadissertacao, artigos
        alunos[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);
        for (int i=0; i<alunos.length; i++){
            System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", alunos[i].getNome(), alunos[i].getNotaFinal());
        }
//        Teste 2:
//        Pessoa pessoas[] = new Pessoa[4];
//        pessoas[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0);
//        pessoas[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
//        pessoas[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0);
//        pessoas[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);
//        for (int i=0; i<pessoas.length; i++){
//            Aluno aluno = (Aluno) pessoas[i];
//            System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", aluno.getNome(), aluno.getNotaFinal());
//        }   
    }
}
