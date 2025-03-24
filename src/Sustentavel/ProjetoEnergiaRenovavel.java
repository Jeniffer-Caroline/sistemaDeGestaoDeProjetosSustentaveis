package Sustentavel;

public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome) {
        super(nome);
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    @Override
    public double calcularImpacto() {
        System.out.println("Impacto: " + energiaGerada + " MW de energia gerada.");
        return 0;
    }
}