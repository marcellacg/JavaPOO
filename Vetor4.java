package MeuPacote;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.sqrt;

public class Vetor4 {
    public static void main (String[] args){
        int[] E = new int[15];
        int[] F = new int[15];

        Scanner tec = new Scanner(System.in);
        int i;
        for (i = 0; i < E.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            E[i] = tec.nextInt();
        }
        for (i = 0; i < F.length; i++){
            F[i] = (int) sqrt(E[i]);
        }
        System.out.println(Arrays.toString(F));
    }
}
