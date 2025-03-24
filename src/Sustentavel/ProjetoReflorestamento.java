package Sustentavel;
import Sustentavel.ProjetoSustentavel;


public class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome) {
        super(nome);
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public double calcularImpacto() {
        System.out.println("Impacto: " + arvoresPlantadas + " árvores plantadas.");
        return 0;
    }
}
