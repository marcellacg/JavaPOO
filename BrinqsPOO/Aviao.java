/*Herança: quando classes podem conceber outras. Dentro de uma superclasse (classe mãe) geram-se
 subclasses (classes filhas), que herdam características (em comum) dessa superclasse, podendo
 também conter características próprias.*/
public class Aviao extends Brinquedo {

    public Aviao(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }

    @Override
    public void mover() {
        int velocidade = (getAceleracao() * 100) + 50;
        System.out.println(velocidade);
    }
}
