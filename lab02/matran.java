package lab02;
import java.util.Scanner;
public class matran{
    public static void main(String[] args){

            
            Scanner s = new Scanner(System.in);
            System.out.println("Nhap so dong cua ma tran: ");
            int m = s.nextInt();
            System.out.println("Nhap so cot cua ma tran: ");
            int n = s.nextInt();
            int A[][] = new int[m][n];
            int B[][] = new int[m][n];
            int C[][] = new int[m][n];
 
        System.out.println("Nhập vào các phần tử của ma trận A: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("A[" + i + "]["+ j + "] = ");
                        A[i][j] = s.nextInt();
                    }
                }
        System.out.println("Nhập vào các phần tử của ma trận B: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("B[" + i + "]["+ j + "] = ");
                        B[i][j] = s.nextInt();
                    }
                }
        for(int i = 0; i < m; i++){
            for(int j=0; j< n; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }

}