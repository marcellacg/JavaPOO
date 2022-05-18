public class MilitarMarinha extends Militar implements Carreira{
    private boolean participouConsertoAviao;

    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
        super(matricula, patente);
        this.participouConsertoAviao = participouConsertoAviao;
    }

    @Override
    public boolean podeProgredir(){
        if (this.participouConsertoAviao == true){
            return true;
        }
        return false;
    }
}
