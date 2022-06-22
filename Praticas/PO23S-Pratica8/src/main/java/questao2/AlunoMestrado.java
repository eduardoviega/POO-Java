package questao2;

public class AlunoMestrado extends Aluno {
    private String nome;
    private int ra;
    private double notaDisciplinas;
    private double notaDissertacao;
    private int artigosPublicados;
    private double notaFinal;
    
    public AlunoMestrado(String nome, int ra, double disci, double disser, int arti){
        this.nome = nome;
        this.ra = ra;
        this.notaDisciplinas = disci;
        this.notaDissertacao = disser;
        this.artigosPublicados = arti;
        this.notaFinal = (disci + disser)/2;
    }
        
    @Override
    public double getNotaFinal() {
        if(!(artigosPublicados == 0)){
            return notaFinal;
        }else{
            return 0;
        }
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

    public double getNotaDissertacao() {
        return notaDissertacao;
    }
    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }

    public int getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setArtigosPublicados(int artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }
}
