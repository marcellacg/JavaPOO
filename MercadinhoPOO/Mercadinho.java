package mercadinho.clientes;
import java.util.ArrayList;

public class Mercadinho {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente c){
        clientes.add(c);
    }

    public void calcularTotal(){
        double aux = 0;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getValorDaCompra() <= 0) {
                System.out.println("O valor da compra de " + clientes.get(i).getNome() + " deve ser maior que R$0.00 reais.");
            } else {
                aux += clientes.get(i).calcularPagamento();
            }
        }
        System.out.println("O valor total da(s) compra(s) é de R$" + aux + " reais.");
        System.out.println("\n_________NOMES DOS CLIENTES__________");
    }



    public void imprimirCliente(){
        for (int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i).getNome());
        }
    }
}