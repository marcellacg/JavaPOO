package cadastro.veiculos;

public class Carro extends Automovel {
    private int potencia, qntDePortas;

    public Carro(int velocidade, int ano, double valor, String descricao, String placa, int potencia, int qntDePortas){
        super(velocidade,ano, valor, descricao, placa);
        this.potencia = potencia;
        this.qntDePortas = qntDePortas;
    }

    public int getPotencia(){
        return potencia;
    }

    public int getQntDePortas(){
        return qntDePortas;
    }

    @Override
    public void acelerar() { acelerarCarroOuMoto(this.velocidade); }

    @Override
    public void frear(){
        frearCarroOuMoto(this.velocidade);
    }


    @Override
    public String toString() {
        return "Carro {" +
                "velocidade: " + velocidade +
                ", ano: " + ano +
                ", valor: " + valor +
                ", descricao: " + descricao + '\'' +
                ", placa: " + placa + '\'' +
                ", potencia: " + potencia +
                ", Quantidade DePortas: " + qntDePortas +
                '}';
    }
}
