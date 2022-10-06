public class Main {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Zezinho", 5);
        Guerreiro g2 = new Guerreiro("Luizinho", 4);
        boolean condicao = true;
        while (condicao) {
            g1.lutar(g2);
            if (g1.getEnergia() > 0 && g1.getEnergia() > g2.getEnergia()){
                System.out.println("Guerreiro " + g1.getNome() + " ganhou.");
                condicao = false;
                System.out.println(g1);
            } else {
                System.out.println("Guerreiro " + g2.getNome() + " ganhou.");
                condicao = false;
                System.out.println(g2);
            }
        }
        g1.alimentar();
    }
}
