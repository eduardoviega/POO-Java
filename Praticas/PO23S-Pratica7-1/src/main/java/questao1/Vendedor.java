package questao1;

public class Vendedor extends Usuario{
    private double comissao;
    
    public Vendedor(String login, String password, double comissao){
        this.setLogin(login);
        this.setPassword(password);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }  
}
