public class Principal {
    public static void main(String[] args){
        CadastroBrinquedo brinqs = new CadastroBrinquedo(3);
        //Objeto: São elementos que estão dentro de um conjunto (que no caso é uma classe)
        Carro c1 = new Carro(40, 50);
        Barco b1 = new Barco(30,60);
        Aviao a1 = new Aviao(80,79);

        brinqs.adicionarBrinquedos(c1);
        brinqs.adicionarBrinquedos(b1);
        brinqs.adicionarBrinquedos(a1);

        brinqs.todoMundoSeMovendo();
        /*Polimorfismo: Acontece ao invocarmos os respectivos objetos. É a partir deles que os métodos
         de mesmo nome com funcionalidades distintas) das subclasses irão operar, implementando-os de acordo
         com o que for chamado no objeto.*/
        System.out.println("------------------------------RESPOSTAS-----------------------------------------");
        System.out.println("A RESPOSTA DA PRIMEIRA QUESTÃO ESTÁ ESPALHADA PELAS CLASSES DA APLICAÇÃO EM COMENTÁRIOS.");
        System.out.println("2)Administração de problemas que em um primeiro momento não são \"pontuados\" na aplicação. Ou seja,\n" +
                "é tratar situações inesperadas. Sem exceções o programa continua funcionando. Tem-se uma hierarquia\n" +
                "de classes em java para tratar essas exceções. São elas:\n" +
                "A classe Throwable, representa um erro lançável. Quem for responsável pelo tratamento, irá tratar\n" +
                "o erro, quem não for, lança de volta. De um lado de Throwable temos as classes filhas de Error\n" +
                "(que herdam dela); do outro lado temos a classe Exception, e abaixo dela temos a classe\n" +
                "RuntimeException e do outro diversas outras classes. As exceções verificadas têm manipulação dessas\n" +
                "exceções, elas são visíveis para o desenvolvedor para serem tratadas. Já as não verificadas não são reconhecidas na compilação.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("3)\n" +
                "Na hierarquia das interfaces para coleções, temos:\n" +
                "\n" +
                "Set: que não contém objetos duplicados. Seus elementos não são acessados através de índices.\n" +
                "Aqui tem-se a Interface SortedSet (define que a coleção deve ser ordenada);\n" +
                "a classe HashSet (representando os elementos em uma tabela Hash);\n" +
                "e a Classe TreeSet (Representando os elementos em uma árvore); \n" +
                "\n" +
                "Queue: que representa uma fila, implementa uma lista dinâmica. Os elementos também não são acessados através de índices.\n" +
                "Aqui tem-se a Interface Queue (onde os elementos são inseridos no final e removidos no início);\n" +
                "a Interface Deque (onde os elementos são inseridos/removidos no início/fim;\n" +
                "e a Classe LinkedList (que depende diretamente do tipo de interface escolhida para manipulação);\n" +
                "\n" +
                "List: que contém/permite objetos duplicados. Implementa uma lista dinâmica com acesso liberado para qualquer\n" +
                "de um dos elementos nela contidos. Os elementos são acessados através de índices.");

    }
}
