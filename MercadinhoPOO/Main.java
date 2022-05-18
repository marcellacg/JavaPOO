package mercadinho.clientes;

public class Main {
    public static void main(String[] args){
        Mercadinho mercadinho = new Mercadinho();

        ClienteRegular cliReg = new ClienteRegular(25.00, "José");
        ClienteRegular cliReg2 = new ClienteRegular(0.00, "Mario");
        ClienteVIP cliVip = new ClienteVIP(25.00, "Maria", "24875278-51");
        ClienteOuroVIP cliOuroVip = new ClienteOuroVIP(25.00, "João", "Rua Pinha, 31");
        ClienteOuroVIP cliOuroVip2 = new ClienteOuroVIP(25.00, "Lúcia", "Rua Neves");

        mercadinho.adicionarCliente(cliReg);
        mercadinho.adicionarCliente(cliVip);
        mercadinho.adicionarCliente(cliOuroVip);
        mercadinho.adicionarCliente(cliOuroVip2);
        mercadinho.adicionarCliente(cliReg2);

        mercadinho.calcularTotal();
        mercadinho.imprimirCliente();


    }
}
