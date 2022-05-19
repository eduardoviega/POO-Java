package questao1;

public class MinhaClasse implements MinhaInterface {
    private String frase;

    @Override
    public void concatenar(String s){
        this.frase = getFrase().concat(s);
    }    
    
    @Override
    public int tamanho(){
        return frase.length();
    }
    
    @Override
    public String getFrase(){
        return frase;
    }
    
    @Override
    public void setFrase(String frase){
        this.frase = frase;
    }
}