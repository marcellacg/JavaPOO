package cadastro.veiculos;

public class Caminhao extends Automovel{
    private double cargaSuportada, comprimento;

    public Caminhao(int velocidade, int ano, double valor, String descricao, String placa, double cargaSuportada, double comprimento){
        super(velocidade, ano, valor, descricao, placa);
        this.cargaSuportada = cargaSuportada;
        this.comprimento = comprimento;
    }

    public double getCargaSuportada(){
        return cargaSuportada;
    }

    public double getComprimento(){
        return comprimento;
    }

    @Override
    public void acelerar() { acelerarCaminhaoOuOnibus(this.velocidade); }

    @Override
    public void frear(){
        frearCaminhaoOuOnibus(this.velocidade);
    }


    @Override
    public String toString() {
        return "Caminhao {" +
                "velocidade: " + velocidade +
                ", ano: " + ano +
                ", valor: " + valor +
                ", descricao: '" + descricao + '\'' +
                ", placa: " + placa + '\'' +
                ", cargaSuportada: " + cargaSuportada +
                ", comprimento: " + comprimento +
                '}';
    }
}
