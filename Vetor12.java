package MeuPacote;
import java.util.Scanner;

public class Vetor12 {
    public static void main (String[] args){
        int[] A = new int[3];

        Scanner tec = new Scanner(System.in);
        int i;
        int soma = 0;
        for (i = 0; i < A.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            A[i] = tec.nextInt();
            soma = soma + A[i];
        }
        System.out.println(soma);
    }
}
