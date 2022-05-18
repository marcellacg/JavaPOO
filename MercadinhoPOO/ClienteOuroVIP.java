package mercadinho.clientes;

public class ClienteOuroVIP extends Cliente {
    private String endereço;

    public ClienteOuroVIP(double valorDaCompra, String nome, String endereço){
        super(valorDaCompra, nome);
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    @Override
    public double calcularPagamento(){
        double desconto = (this.getValorDaCompra() * 15) / 100;
        return this.getValorDaCompra() - desconto;
    }

    @Override
    public String toString() {
        return "ClienteOuroVIP{" +
                "endereço='" + endereço + '\'' +
                '}';
    }
}
