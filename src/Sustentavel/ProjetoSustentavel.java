package Sustentavel;

import Interface.ImpactoAmbiental;
import java.util.ArrayList;
import java.util.List;

public abstract class ProjetoSustentavel implements ImpactoAmbiental {
    private String nome;
    private String descricao;
    private List<Voluntario> voluntarios;
    private relatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(String nome) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
        this.relatorioImpacto = new relatorioImpacto();
    }

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

    public void addVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    public relatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;
    }

    public void setRelatorioImpacto(relatorioImpacto relatorioImpacto) {
        this.relatorioImpacto = relatorioImpacto;
    }

    @Override
    public abstract double calcularImpacto();
}