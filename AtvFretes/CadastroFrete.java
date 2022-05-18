package fretes.cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroFrete{

    private List<Frete> items = new ArrayList<>();

    public void adicionarFrete(Frete item) {
        if (this.items.size() <= 10) {
            this.items.add(item);
            if (this.items.size() == 10) {
                System.out.println("Limite máximo atingido! Não é permitido adicionar mais de 10 fretes!");
            }
        }
        else{
            this.items.remove(10);
        }

    }

    public void valorTotalFretes(){
        double aux = 0;
        for (int i = 0; i < items.size(); i++) {

                aux += items.get(i).calcularFrete(items.get(i).getDistancia(), items.get(i).getValorPorKm());
        }
        System.out.println("Soma total dos fretes: " + aux);
    }

}
