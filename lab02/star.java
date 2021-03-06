import java.util.Scanner;
public class star {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap so dong muon in");
        int column =n.nextInt();
    for(int i = 1; i<= column ; i++){
        for(int j = i ; j<column ; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= +(2*i -1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    
}
