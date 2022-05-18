package mercadinho.clientes;

public class ClienteVIP extends Cliente {
    private String numeroDoCartão;

    public ClienteVIP(double valorDaCompra, String nome, String numeroDoCartao){
        super(valorDaCompra, nome);
        this.numeroDoCartão = numeroDoCartão;

    }

    public String getNumeroDoCartão() {
        return numeroDoCartão;
    }

    public void setNumeroDoCartão(String numeroDoCartão) {
        this.numeroDoCartão = numeroDoCartão;
    }

    @Override
    public double calcularPagamento(){
        double desconto = (this.getValorDaCompra() * 10) / 100;
        return this.getValorDaCompra() - desconto;
    }


    @Override
    public String toString() {
        return "ClienteVIP{" +
                "numeroDoCartão='" + numeroDoCartão + '\'' +
                '}';
    }
}
