package MeuPacote;
import java.util.Scanner;

public class Vetor11 {
    public static void main (String[] args){
        int[] A = new int[10];

        Scanner tec = new Scanner(System.in);
        int i;
        int cont = 0;
        for (i = 0; i < A.length; i++){
            System.out.println("Digite o " + (i+1)+"º" + " numero");
            A[i] = tec.nextInt();
            if ((A[i] % 2) == 0) {
                cont = cont + 1;
            }
        }
        System.out.println("Existe(m) " + cont + " números pares");
    }
}
