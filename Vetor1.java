package MeuPacote;
import java.util.Scanner;
import java.util.Arrays;
//import static java.lang.Math.sqrt;
public class Vetor1 {
    public static void main(String[] args) {
        //PRIMEIRA QUESTÃO

        int[] A = new int[5];
        int[] B = new int[5];

        Scanner teclado = new Scanner(System.in);
        int i;
        for (i = 0; i < A.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            A[i] = teclado.nextInt();
        }
        for (i = 0; i < B.length; i++){
            B[i] = A[i];
        }
        System.out.println(Arrays.toString(B));
    }
}
