import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        int sayi;
        boolean isAsal;
        Scanner sc=new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        sayi=sc.nextInt();

        isAsal=isAsal(sayi,sayi/2+1);

        if (isAsal){
            System.out.println(sayi + " sayısı ASALDIR !");
        }else
            System.out.println(sayi + " sayısı ASAL değildir !");
    }

    static boolean isAsal(int sayi,int checkVal){

        if (checkVal==1){
            return true;
        } else if (sayi%checkVal==0){
            return false;
        }else
            return isAsal(sayi, checkVal-1);
    }
}
