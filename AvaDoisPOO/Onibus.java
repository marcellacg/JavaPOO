package cadastro.veiculos;

public class Onibus extends Automovel {
    private int capacidadePassageiros;
    private double comprimento;

    public Onibus(int velocidade, int ano, double valor, String descricao, String placa, int capacidadePassageiros, double comprimento){
        super(velocidade, ano, valor, descricao, placa);
        this.capacidadePassageiros = capacidadePassageiros;
        this.comprimento = comprimento;
    }

    public int getCapacidadePassageiros(){
        return capacidadePassageiros;
    }

    public double getComprimento(){
        return comprimento;
    }

    @Override
    public void acelerar(){
        acelerarCaminhaoOuOnibus(this.velocidade);
    }

    @Override
    public void frear(){
        frearCaminhaoOuOnibus(this.velocidade);
    }


    @Override
    public String toString() {
        return "Onibus {" +
                "velocidade: " + velocidade +
                ", ano: " + ano +
                ", valor: " + valor +
                ", descricao: '" + descricao + '\'' +
                ", placa: '" + placa + '\'' +
                ", capacidadePassageiros: " + capacidadePassageiros +
                ", comprimento: " + comprimento +
                '}';
    }
}
