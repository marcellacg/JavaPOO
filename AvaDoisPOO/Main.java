package cadastro.veiculos;

public class Main {
    public static void main(String[] args) {

        Competicao automoveis = new Competicao(4);

        Moto m1 = new Moto(80, 2015, 15.00, "Veículo novo", "MCG-7895", 100);
        Carro c1 = new Carro(90, 2000, 75.00, "Veículo seminovo", "GDF-7845", 500, 4);
        Caminhao ca1 = new Caminhao(50, 2012, 400.00, "Veículo pesado", "NVF-7895", 900.00, 6.00);
        Onibus on1 = new Onibus(60, 2005, 150.00, "Veículo para passeio", "BVC-8594", 26, 5.00);

        automoveis.adicionarVeiculo(m1);
        automoveis.adicionarVeiculo(c1);
        automoveis.adicionarVeiculo(ca1);
        automoveis.adicionarVeiculo(on1);

        automoveis.listarTodos();
        //automoveis.acelerarTodos();
        automoveis.frearTodos();
        System.out.println("\n____________________________");
        System.out.println("Polimorfismo acontece nesses vínculos de classes (já baseados na questão da herança) quando utilizamos\n" +
                "seus diferentes métodos para desempenhar atividades diversas. Por exemplo: tudo que implementamos na classe Main é\n" +
                "polimórfico, já que passamos os dados apenas uma vez; chamamos o método para objetos diferentes, e ele nos traz assim os resultados esperados.");
    }
}
