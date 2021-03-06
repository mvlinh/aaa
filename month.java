package lab02;
import java.util.Scanner;
public class month {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("nhap thang muon tim: ");
        String abc = n.nextLine();
        System.out.println("nhap nam muon tim: ");
        int year = n.nextInt();
        System.out.println(abc);
        int month = 0;
        String month1[] = {"January","Jan","Jan.","1"};
        String month2[] = {"February","Feb","Feb.","2"};
        String month3[] = {"March","Mar","Mar.","3"};
        String month4[] = {"April","Apr","Apr.","4"};
        String month5[] = {"May","May","May.","5"};
        String month6[] = {"June","June","Jun","6"};
        String month7[] = {"July","July","Jul","7"};
        String month8[] = {"August","Aug.","Aug","8"};
        String month9[] = {"September","Sept.","Sept","8"};
        String month10[] = {"October","Oct.","Oct","10"};
        String month11[] = {"November","Nov.","Nov","11"};
        String month12[] = {"December","Dec.","Dec","12"};
        for(int i = 0 ; i<4 ; i++){
            if(abc.equals(month1[i])){
                month = 1;
            }
            else if(abc.equals(month2[i] )){
                month = 2;
            }
            else if(abc.equals(month3[i] )){
                month = 3;
            }
            else if(abc.equals(month4[i]) ){
                month = 4;
            }
            else if(abc.equals(month5[i]) ){
                month = 5;
            }
            else if(abc.equals(month6[i]) ){
                month = 6;
            }
            else if(abc.equals(month7[i])){
                month = 7;
            }
            else if(abc.equals(month8[i] )){
                month = 8;
            }
            else if(abc.equals(month9[i])){
                month = 9;
            }
            else if(abc.equals(month10[i])){
                month = 10;
            }
            else if(abc.equals(month11[i])){
                month = 11;
            }
            else if(abc.equals(month12[i])){
                month = 12;
            }
        }
        switch(month){
            case 2:
                if(year % 100 == 0 && year % 400 !=0)
                    System.out.println("nam "+year+" thang "+month+" co so ngay la: 28");
                else if (year % 4 == 0){
                    System.out.println("nam "+year+" thang "+month+" co so ngay la: 29");
                }
                else 
                    System.out.println("nam "+year+" thang "+month+" co so ngay la: 28");
                 break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("nam "+year+" thang "+month+" co so ngay la: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("nam "+year+" thang "+month+" co so ngay la: 30");
                break;
            default:
                System.out.println("có thể bạn nhập k đúng định dạng vui long nhập lại");
        }
 }
}
