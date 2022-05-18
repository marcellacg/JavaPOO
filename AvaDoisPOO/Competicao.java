package cadastro.veiculos;

public class Competicao {

    private Veiculo[] veiculos;
    private int indice;

    public Competicao(int tamanho){
        veiculos = new Veiculo[tamanho];
        indice = 0;
    }

    public void adicionarVeiculo(Veiculo a){
        if(indice < veiculos.length){
            veiculos[indice] = a;
            indice++;
        }
    }

    public void listarTodos() {
        System.out.println("\nListando todos os veículos:");
        for (int cont = 0; cont < veiculos.length; cont++){
            System.out.println(veiculos[cont].toString());
        }
    }

    public void acelerarTodos(){
        System.out.println("\nAcelerando todos os veículos:");
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].acelerar();
        }
    }

    public void frearTodos(){
        System.out.println("\nFreando todos os veículos:");
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].frear();
        }
    }
}
