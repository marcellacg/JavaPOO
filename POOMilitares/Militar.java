public abstract class Militar {
    private int matricula;
    private String patente;

    public Militar(int matricula, String patente){
        this.matricula = matricula;
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
