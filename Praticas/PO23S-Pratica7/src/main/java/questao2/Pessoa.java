package questao2;

public class Pessoa {
    private String nome;
    private int idade; 

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String retornaDados(){
        return nome + " -- " + idade;
    }
    public void fazerAniversario(){
        idade++;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}