package Sustentavel;

public class ProjetoReciclagem extends ProjetoSustentavel{
    private int toneladasRecicladas;


    public ProjetoReciclagem(String nome, int toneladasRecicladas) {
        super(nome);
        this.toneladasRecicladas = toneladasRecicladas;
    }
@Override
public int calcularImpacto(){
    System.out.println("Impacto: " + toneladasRecicladas + "toneladas recicladas");
    return 0;
}
    public double getToneladasRecicladas(){
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(int toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }
}
