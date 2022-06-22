package questao2;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    
    public Pessoa(String n, double a, double p){
        this.nome = n;
        this.altura = a;
        this.peso = p;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return nome;
    }
    
    public void setAltura(double a){
        this.altura = a;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double p){
        this.peso = p;
    }
    public double getPeso(){
        return peso;
    }
}
