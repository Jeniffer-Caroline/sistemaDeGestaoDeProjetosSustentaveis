package Sustentavel;

public class Empresa extends Organizacao{

    public double calcularImpacto(){


        return this.faturamentoAnual * 0.1;
    }
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
