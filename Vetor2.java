package MeuPacote;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {

        //SEGUNDA QUESTÃO
        int[] C = new int[8];
        int[] D = new int[8];

        Scanner tec = new Scanner(System.in);
        int i;
        for (i = 0; i < C.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            C[i] = tec.nextInt();
        }
        for (i = 0; i < D.length; i++){
            D[i] = C[i] * 2;
        }
        System.out.println(Arrays.toString(D));
    }
}
