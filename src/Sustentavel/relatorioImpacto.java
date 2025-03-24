package Sustentavel;
import Interface.ImpactoAmbiental;

public class relatorioImpacto {
    private int arvoresPlantadas;
    private double reducaoCO2;

    public relatorioImpacto() {
        this.arvoresPlantadas = 0;
        this.reducaoCO2 = 0.0;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public double getReducaoCO2() {
        return reducaoCO2;
    }

    public void setReducaoCO2(double reducaoCO2) {
        this.reducaoCO2 = reducaoCO2;
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Impacto:");
        System.out.println("Árvores plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCO2 + " toneladas");
    }
}