package questao1;

public class Autenticador {
    private String[][] contas = new String[3][2];
    
    public Autenticador(){
        this.contas[0][0] = "joao";
        this.contas[0][1] = "123";
        this.contas[1][0] = "maria";
        this.contas[1][1] = "abc";
        this.contas[2][0] = "raul";
        this.contas[2][1] = "xyz";
    }
    
    public boolean autenticar(Usuario user, boolean trueOrFalse){
        if(!trueOrFalse){
            for(int i=0; i<3; i++){
                if(this.contas[i][0] == user.getLogin()){
                    if(this.contas[i][1] == user.getPassword()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}