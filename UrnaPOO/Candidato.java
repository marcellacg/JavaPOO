public class Candidato {
    private String NomeCandidato;
    private int NumeroDoPartido, NumeroDeVotos;
    
    public Candidato(String NomeCandidato, int NumeroDoPartido){
        this.NomeCandidato = NomeCandidato;
        this.NumeroDoPartido = NumeroDoPartido;
        NumeroDeVotos = 0;
    }
    
    public String getNomeCandidato(){
        return NomeCandidato;
    }
    
    public int getNumeroPartido(){
        return NumeroDoPartido;
    }
    
    public int getNumeroDeVotos(){
        return NumeroDeVotos;
    }
    
    public int getIncrementarVotos(){
        return NumeroDeVotos++;
    }
    
    public String toString(){
        return NomeCandidato + " Do Partido: " + NumeroDoPartido + " Com número de votos: " + NumeroDeVotos;
    }
}
