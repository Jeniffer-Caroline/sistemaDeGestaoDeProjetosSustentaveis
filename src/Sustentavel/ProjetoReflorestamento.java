package Sustentavel;

public class ProjetoReflorestamento extends ProjetoSustentavel {

    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, int arvoresPlantadas) {
        super(nome);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public int calcularImpacto() {
        System.out.println("Impacto: " + arvoresPlantadas + " árvores plantadas");
        return arvoresPlantadas;
    }
}