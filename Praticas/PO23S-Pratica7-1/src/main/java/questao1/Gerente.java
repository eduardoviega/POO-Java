package questao1;

public class Gerente extends Usuario{
    private double salario;
    private double bonus;
    
    public Gerente(String login, String password, double salario, double bonus) {
        this.setLogin(login);
        this.setPassword(password);
        this.salario = salario;
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
