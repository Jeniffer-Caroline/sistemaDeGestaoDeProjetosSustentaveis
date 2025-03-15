package Sustentavel;

public class Voluntario {
    //Atributos
    private String nome;
    private String email;

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //Métodos
    public void participarProjeto(ProjetoSustentavel projeto){
projeto.adicionarVoluntario(this);
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}