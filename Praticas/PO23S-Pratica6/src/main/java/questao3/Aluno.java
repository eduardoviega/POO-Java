package Questao3;

class Aluno extends Pessoa {
    private int matricula;

    public void setMatricula(int mat){
        this.matricula = mat;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void printDados(){
        System.out.println(this.matricula);
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
    }
}