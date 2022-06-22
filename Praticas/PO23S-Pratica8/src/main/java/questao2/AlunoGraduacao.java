package questao2;

public class AlunoGraduacao extends Aluno{
    private String nome;
    private int ra;
    private double notaDisciplinas;
    private double notaTCC;
    private double notaFinal;
    
    public AlunoGraduacao(String nome, int ra, double disci, double tcc){
        this.nome = nome;
        this.ra = ra;
        this.notaDisciplinas = disci;
        this.notaTCC = tcc;
        this.notaFinal = (disci + tcc)/2;
    }
    
    @Override
    public double getNotaFinal() {
        return notaFinal;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getRa() {
        return ra;
    }
    @Override
    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public double getNotaDisciplinas() {
        return notaDisciplinas;
    }
    @Override
    public void setNotaDisciplinas(double notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }

    public double getNotaTCC() {
        return notaTCC;
    }
    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }

}
