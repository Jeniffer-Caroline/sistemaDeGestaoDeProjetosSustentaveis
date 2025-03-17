package Sustentavel;

public class ProjetoEnergiaRenovavel extends ProjetoSustentavel{
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, double energiaGerada) {
        super(nome);
        this.energiaGerada = energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }
}
