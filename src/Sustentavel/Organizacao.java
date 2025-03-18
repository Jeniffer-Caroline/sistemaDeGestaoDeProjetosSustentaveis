package Sustentavel;

import java.util.ArrayList;

import java.util.List;
     //Atributos
public abstract class Organizacao {

    private String nome;

    private List<ProjetoSustentavel> listaProjetos;

    public Organizacao(String nome){
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }
    public void adicionaProjeto(ProjetoSustentavel projeto) {
        this.listaProjetos.add(projeto);

    }

    public void listarProjetos(){
        for (ProjetoSustentavel projeto : listaProjetos){
            System.out.println(projeto.getNome());
        }
    }

         public String getNome() {
             return nome;
         }

         public void setNome(String nome) {
             this.nome = nome;
         }

         public List<ProjetoSustentavel> getListaProjetos() {
             return listaProjetos;
         }

         public void setListaProjetos(List<ProjetoSustentavel> listaProjetos) {
             this.listaProjetos = listaProjetos;
         }
         public abstract double calcularImpacto();
     }
