import Sustentavel.Organizacao;

import Sustentavel.ProjetoSustentavel;
import Sustentavel.Voluntario;
import Sustentavel.relatorioImpacto;

public class Main {
    public static void main(String[] args) {
        // Criar organização
        Organizacao organizacao = new Organizacao("Greenpeace");

        // Criar projetos sustentáveis
        ProjetoSustentavel projeto1 = new ProjetoSustentavel("Reflorestamento") {
            @Override
            public double calcularImpacto() {
                return 0;
            }
        };
        projeto1.setNome("Reflorestamento");

        ProjetoSustentavel projeto2 = new ProjetoSustentavel("Reciclagem") {
            @Override
            public double calcularImpacto() {
                return 0;
            }
        };
        projeto2.setNome("Reciclagem");


        // Criar voluntários
        Voluntario voluntario1 = new Voluntario("Kátia", "Katia123@gmail.com");
        Voluntario voluntario2 = new Voluntario("Ísis", "Isis123@gmail.com");

        // Associar voluntários a projetos
        voluntario1.participarProjeto(projeto1);
        voluntario2.participarProjeto(projeto2);

        // Criar relatório de impacto
        relatorioImpacto relatorio = new relatorioImpacto();
        relatorio.setArvoresPlantadas(100);
        relatorio.setReducaoCO2(10.0);

        // Exibir os resultados do relatório
        relatorio.exibirRelatorio();
    }
}