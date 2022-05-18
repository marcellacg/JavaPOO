public class Urna {
    private Candidato candidato1, candidato2;
    private int TotalBrancosNulos, TotalGeral;
    
    public Urna(Candidato candidato1, Candidato candidato2){
        this.candidato1 = candidato1;
        this.candidato2 = candidato2;
        TotalBrancosNulos = 0;
        TotalGeral = 0;
    }
    
    public void votar(int opcaoEscolhida){  //void pois ele não retorna um valor
        TotalGeral++;
        if (opcaoEscolhida == 1){
            candidato1.getIncrementarVotos();
        } else if (opcaoEscolhida == 2){
            candidato2.getIncrementarVotos();
        } else {
            TotalBrancosNulos++;
        }
    }
    
    public void totalGeralVotos(){
        System.out.println("Total geral é: " + TotalGeral);
    }
    
    public void totalBrancosNulos(){
        System.out.println("Total de Brancos e nulos é: " + TotalBrancosNulos);
    }
    
    public void totalVotosCandidatos(){
        System.out.println("Total de votos do " + candidato1.getNomeCandidato() + " é de " + candidato1.getNumeroDeVotos()); 
    }
    
    public void exibirDadosVencedor(){
        if (candidato1.getNumeroDeVotos() > candidato2.getNumeroDeVotos()){
            System.out.println("O vencedor é: " + candidato1);
        } else if (candidato1.getNumeroDeVotos() < candidato2.getNumeroDeVotos()){
            System.out.println("O vencedor é: " + candidato2);
        } else
            System.out.println("Empate");
            
    }
}
