package MeuPacote;
import java.util.Scanner;
import java.util.Arrays;

public class Vetor9 {
    public static void main (String[] args){
        int[] A = new int[2];
        int[] B = new int[2];
        double[] C = new double[2];

        Scanner tec = new Scanner(System.in);
        int i;
        for (i = 0; i < A.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            A[i] = tec.nextInt();
        }
        System.out.println();

        for (i = 0; i < B.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            B[i] = tec.nextInt();
            C[i] = A[i] / (float)B[i];
        }
        System.out.println(Arrays.toString(C));
    }
}
