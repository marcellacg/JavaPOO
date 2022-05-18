package mercadinho.clientes;

public class ClienteRegular extends Cliente {

    public ClienteRegular(double valorDaCompra, String nome){
        super(valorDaCompra, nome);
    }

    @Override
    public double calcularPagamento(){
        return this.getValorDaCompra();
    }

}
