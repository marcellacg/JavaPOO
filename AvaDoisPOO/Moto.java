package cadastro.veiculos;

public class Moto extends Automovel {
    private int potencia;

    public Moto(int velocidade, int ano, double valor, String descricao, String placa, int potencia){
        super(velocidade,ano, valor, descricao, placa);
        this.potencia = potencia;
    }

    public int getPotencia(){
        return potencia;
    }

    @Override
    public void acelerar() { acelerarCarroOuMoto(this.velocidade); }

    @Override
    public void frear(){
        frearCarroOuMoto(this.velocidade);
    }


    @Override
    public String toString() {
        return "Moto{" +
                "velocidade: " + velocidade +
                ", ano: " + ano +
                ", valor: " + valor +
                ", descricao: '" + descricao + '\'' +
                ", placa: '" + placa + '\'' +
                ", potencia: " + potencia + '}';
    }
}
