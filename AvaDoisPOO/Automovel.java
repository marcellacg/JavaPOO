package cadastro.veiculos;

public abstract class Automovel implements Veiculo {

    protected int velocidade, ano;
    protected double valor;
    protected String descricao, placa;

    public Automovel(int velocidade, int ano, double valor, String descricao, String placa){
        this.velocidade = velocidade;
        this.ano = ano;
        this.valor = valor;
        this.descricao = descricao;
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPlaca() {
        return placa;
    }

    protected void acelerarCarroOuMoto(int velocidade){
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade += 10;
            System.out.println(this.velocidade);
        }
    }

    protected void acelerarCaminhaoOuOnibus(int velocidade){
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade += 8;
            System.out.println(this.velocidade);
        }
    }

    protected void frearCarroOuMoto(int velocidade){
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade -= 10;
            System.out.println(this.velocidade);
        }
    }

    protected void frearCaminhaoOuOnibus(int velocidade){
        if (this.velocidade <= 0){
            System.out.println("Valor não permitido");
        } else {
            this.velocidade -= 8;
            System.out.println(this.velocidade);
        }
    }

    @Override
    public String toString() {
        return "Automovel: " +
                "velocidade: " + velocidade +
                ", ano: " + ano +
                ", valor: " + valor +
                ", descricao: '" + descricao + '\'' +
                ", placa: '" + placa + '\'';
    }
}
