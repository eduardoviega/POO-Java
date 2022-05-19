package questao2;

public abstract class Aluno extends Pessoa {
    private int ra;
    private double notaDisciplinas;

    public abstract double getNotaFinal();

    public int getRa() { return ra; }
    public void setRa(int ra) { this.ra = ra; }
    public double getNotaDisciplinas() { return notaDisciplinas; }
    public void setNotaDisciplinas(double notaDisciplinas) { this.notaDisciplinas = notaDisciplinas; }
}
