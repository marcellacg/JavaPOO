public class Carro extends Brinquedo {

    public Carro(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }

    @Override
    //Método: realizam ações dos objetos
    public void mover(){
        int velocidade = (getAceleracao() * 4) + 15;
        System.out.println(velocidade);
    }
}
