package fretes.cadastro;

public class Principal {
    public static void main(String[] args) {

        CadastroFrete cadastroFrete = new CadastroFrete();

        Frete f1 = new FreteExpresso(1,2,45);
        Frete f2 = new FretePadrao(10, 20);
        Frete f3 = new FreteSuperExpresso(10,30,1,2);

        cadastroFrete.adicionarFrete(f1);
        cadastroFrete.adicionarFrete(f2);
        cadastroFrete.adicionarFrete(f3);

        cadastroFrete.valorTotalFretes();

        System.out.println("POLIMORFISMO ACONTECE AO INVOCARMOS OS RESPECTIVOS OBJETOS. É A PARTIR DELES QUE OS MÉTODOS (DE MESMO NOME COM FUNCIONALIDADES DISTINTAS)\n DAS SUBCLASSES IRÃO OPERAR, IMPLEMENTANDO-OS DE ACORDO COM O QUE FOR CHAMADO NO OBJETO.");
    }
}
