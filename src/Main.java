import Sustenta.Organizacao;
import Sustenta.ProjetoSustentavel;
import Sustenta.Voluntario;
import Sustenta.relatorioImpacto;

public class Main {
    public static void main(String[] args) {
        //criar organização
        Organizacao organização = new Organizacao("Greenpeace");

        //Criar projetos sustentáveis

        ProjetoSustentavel projeto1 = new ProjetoSustentavel("Reflorestamento", "Plantar árvores em áreas degradadas");
        ProjetoSustentavel projeto2 = new ProjetoSustentavel("Reciclagem", "Reciclar materiais em áreas urbanas");

        //Criar voluntáarios
        Voluntario voluntario1 = new Voluntario("Kátia", "Katia123@gmail.com" );
        Voluntario voluntario2 = new Voluntario("Ísis", "Isis123@gmail.com" );

        //Associar voluntários a projetos
        voluntario1.participarProjeto(projeto1);
        voluntario2.participarProjeto(projeto2);

        //Criar relatório de impácto
        relatorioImpacto relatorio = new relatorioImpacto();
        relatorio.setArvoresPlantadas(100);
        relatorio.setReducaoCO2(10.0);

        //Exibir os resultados do relatório

        relatorio.exibirRelatorio();

    }
}