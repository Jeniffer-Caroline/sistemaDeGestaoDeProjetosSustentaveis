package Sustentavel;

import Interface.ImpactoAmbiental;

import java.util.ArrayList;
import java.util.List;

public abstract class ProjetoSustentavel implements ImpactoAmbiental {
    //Atributos
    private String nome;
    private String descricao;
    private List<Voluntario> voluntarios;
    private relatorioImpacto RelatorioImpacto;
    private relatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(String nome) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
        this.RelatorioImpacto = RelatorioImpacto;

    }
    
    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }
    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2){
    this.relatorioImpacto.setArvoresPlantadas(arvoresPlantadas);
    this.relatorioImpacto.setReducaoCO2(reducaoCO2);

}
//Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(List<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public relatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;
    }

    public void setRelatorioImpacto(relatorioImpacto relatorioImpacto) {
        this.relatorioImpacto = relatorioImpacto;
    }

    public abstract int calcularImpacto();
}
