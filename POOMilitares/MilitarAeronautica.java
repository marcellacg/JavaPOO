public class MilitarAeronautica extends Militar implements Carreira{
    private int anosPatente, horasVoo;

    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo){
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }

    @Override
    public boolean podeProgredir(){
        if (this.anosPatente > 2 && this.horasVoo > 100){
            return true;
        }
        return false;
    }
}
