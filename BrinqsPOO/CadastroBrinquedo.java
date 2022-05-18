public class CadastroBrinquedo {
    /*Encapsulamento: a partir da classificação dos atributos como 'private' por exemplo,
    preservamos elementos de classes diferentes de acessá-los, impedindo assim mudanças indevidas.*/
    private Brinquedo[] brinquedosMoviveis;
    private int indice;

    public CadastroBrinquedo(int tamanho){
        brinquedosMoviveis = new Brinquedo[tamanho];
        indice = 0;
    }

    public void adicionarBrinquedos(Brinquedo a){
        if(indice < brinquedosMoviveis.length){
            brinquedosMoviveis[indice] = a;
            indice++;
        }
    }

    public void todoMundoSeMovendo(){
        System.out.println("\nTodo mundo se movendo:");
        for (int i = 0; i < brinquedosMoviveis.length; i++) {
            brinquedosMoviveis[i].mover();
        }
    }
}
