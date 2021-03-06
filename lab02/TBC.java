package lab02;

import java.util.Scanner;

public class TBC {
    public static void main(String[] args){
        //tao mang arry
    int a[] = new int[1000];
    for(int i = 0; i<1000;i++){
        a[i] = (int)( Math.random() *100 );
        // System.out.print(a[i] +"  ");
    }

    Scanner s = new Scanner(System.in);

    System.out.println("nhap vao so phan tu cua mang (< 1000)");
    int n = s.nextInt();
    int b[] = new int[n];
    for(int i = 0; i< n; i++){
        Scanner c = new Scanner(System.in);
        String temp = c.nextLine();
        if(temp.equals("$")){
            b[i] = a[i];
        }
        else{
            b[i] = Integer.parseInt(temp);
        }
        // System.out.println(b[i]);
    }
    for(int i = 0; i < n-1 ; i++){
        for(int j = 0; j < n-1-i ; j++){
            int t = 0;
                if( b[j] > b[ j + 1 ]){
                    t = b[ j + 1 ];
                    b[ j + 1 ] = b[j];
                    b[j] = t;
                }
        }
    }
    double count = 0;
    System.out.println("Mamg da duoc sap xep");
    for(int i = 0 ; i< n; i++ ){
        System.out.print(b[i]+" ");
        count += b[i];
    }
    System.out.println();
    System.out.println("gia tri trung binh cong la: "+(double)(count/(n)));
    }
}
