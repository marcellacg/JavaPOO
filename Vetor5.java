package MeuPacote;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor5 {
    public static void main (String[] args){
        int[] E = new int[10];
        int[] F = new int[10];

        Scanner tec = new Scanner(System.in);
        int i;
        for (i = 0; i < E.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            E[i] = tec.nextInt();
        }
        for (i = 0; i < F.length; i++){
            F[i] = E[i] * i;
        }
        System.out.println(Arrays.toString(F));
    }
}
