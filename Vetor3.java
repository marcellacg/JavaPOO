package MeuPacote;
import java.util.Scanner;
import java.util.Arrays;

public class Vetor3 {
    public static void main (String[] args){

        //TERCEIRA QUESTÃO
        int[] E = new int[15];
        int[] F = new int[15];

        Scanner tec = new Scanner(System.in);
        int i;
        for (i = 0; i < E.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            E[i] = tec.nextInt();
        }
        for (i = 0; i < F.length; i++){
            F[i] = E[i] * E[i];
        }
        System.out.println(Arrays.toString(F));
    }
}
