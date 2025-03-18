package Sustentavel;

public class ONG extends Organizacao {
    private double numeroDeVoluntarios;

    public ONG(String nome, double numeroDeVoluntarios){
        super(nome);
        this.numeroDeVoluntarios = numeroDeVoluntarios;
    }

    public double getNumeroDeVoluntarios() {
        return numeroDeVoluntarios;
    }

    public void setNumeroDeVoluntarios(double numeroDeVoluntarios) {
        this.numeroDeVoluntarios = numeroDeVoluntarios;
    }

    @Override
    public double calcularImpacto(){
        return this.numeroDeVoluntarios * 0.2;
    }
    public ONG(String nome) {
        super(nome);
    }
}
