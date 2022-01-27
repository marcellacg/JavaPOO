package MeuPacote;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor8 {
    public static void main (String[] args){
        int[] E = new int[10];
        int[] F = new int[10];
        int[] G = new int[10];

        Scanner tec = new Scanner(System.in);
        int i;
        for (i = 0; i < E.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            E[i] = tec.nextInt();
        }
        System.out.println();
        for (i = 0; i < F.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            F[i] = tec.nextInt();
            G[i] = E[i] * F[i];
        }
        System.out.println(Arrays.toString(G));
    }
}
