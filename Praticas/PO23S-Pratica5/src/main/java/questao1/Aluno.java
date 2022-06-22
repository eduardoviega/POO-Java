package questao1;

public class Aluno{
    private String nome;
    private int idade;
    private char genero;
    private long ra;
    
    public Aluno(){
        this.nome = "Aluno";
        this.idade = 18;
        this.genero = 'M';
        this.ra = 123456789;
    }
    
    public Aluno(String n, int i){
        this.nome = n;
        this.idade = i;
        this.genero = 'M';
        this.ra = 123456789;
    }
    
    public Aluno(String n, char g, long r){
        this.nome = n;
        this.idade = 18;
        this.genero = g;
        this.ra = r;
    }
    
    public void print(){
        System.out.println(nome+" - "+idade+" - "+ genero+" - "+ra);
    }
}