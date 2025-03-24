package Sustentavel;

public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome) {
        super(nome);
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public double calcularImpacto() {
        System.out.println("Impacto: " + toneladasRecicladas + " toneladas recicladas.");
        return 0;
    }
}