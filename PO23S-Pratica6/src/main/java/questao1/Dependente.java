package Questao1;

public class Dependente extends Pessoa{
    private int idade;
    
    public Dependente(){
        super();
    }
    
    public Dependente(String nome, String endereco, int idade){
        setNome(nome);
        setEndereco(endereco);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
