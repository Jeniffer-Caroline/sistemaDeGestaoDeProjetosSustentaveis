package Sustentavel;

public class ProjetoReciclagem extends ProjetoSustentavel{
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, double toneladasRecicladas) {
        super(nome);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public double getToneladasRecicladas(){
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }
}
