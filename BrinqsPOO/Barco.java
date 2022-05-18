public class Barco extends Brinquedo{

    public Barco(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }

    @Override
    public void mover(){
        int velocidade = (getAceleracao() * 3) + 10;
        System.out.println(velocidade);
    }
}
