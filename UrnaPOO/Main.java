
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Cadastrar dois candidatos
        Candidato candidato1 = new Candidato("Antonio", 1);
        Candidato candidato2 = new Candidato("João", 2);
        Urna urna = new Urna(candidato1, candidato2);
        
        //Votar
        boolean encerrar = false;
        while (!encerrar){
            System.out.println("Digite " + candidato1.getNumeroPartido() + " para votar em " + candidato1.getNomeCandidato());
            System.out.println("Digite " + candidato2.getNumeroPartido() + " para votar em " + candidato2.getNomeCandidato());
            System.out.print("Digite 3 para votar em branco e/ou nulo");
            System.out.print("\nDigite 0 para encerrar a votação");
            System.out.println();

            int opcao = teclado.nextInt();
            if (opcao == 0){
                encerrar = true;
            } else {
                urna.votar(opcao);
            }
        }
        System.out.println();
        //total geral
        urna.totalGeralVotos();
        //total brancos nulos
        urna.totalBrancosNulos();
        //total votos pra cada candidato
        urna.totalVotosCandidatos();
        //candidato vencedor
        urna.exibirDadosVencedor();
    }
}
