public class MilitarExercito extends Militar implements Carreira{
    private boolean participouGuerra, ganhouGuerra;

    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }

    @Override
    public boolean podeProgredir(){
        if (this.participouGuerra == true && this.ganhouGuerra == true){
            return true;
        }
        return false;
    }
}
