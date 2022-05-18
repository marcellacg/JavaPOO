public class Principal {
    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();

        Militar militar1 = new MilitarAeronautica(4145516, "Tenente", 2, 450);
        Militar militar2 = new MilitarMarinha(518712, "Cabo", true);
        Militar militar3 = new MilitarExercito(6588461, "Tenente", true, false);


        cadastro.adicionarMilitares(militar1);
        cadastro.adicionarMilitares(militar2);
        cadastro.adicionarMilitares(militar3);
        cadastro.podeProgredir();
        cadastro.realizarProgressao();
        System.out.println("________________________________________________________________________________");
        System.out.println("!!! TODOS OS MILITARES TÊM SUAS MENSAGENS DE PROGRESSÃO APÓS LISTADOS !!!");
        System.out.println("________________________________________________________________________________");

        System.out.println("POLIMORFISMO ACONTECE AO FAZERMOS A INVOCAÇÃO DOS ESPECÍFICOS OBJETOS, ASSIM OS MÉTODOS DAS SUBCLASSES, COM SUAS RESPECTIVAS OPERAÇÕES,\nIRÃO ATUAR, FAZENDO A IMPLEMENTAÇÃO DE ACORDO COM O QUE FOR CHAMADO NO OBJETO.");
        

    }
}
