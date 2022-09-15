import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        int palindrom;
        Scanner sc=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        palindrom=sc.nextInt();

        if(isPalindrom(palindrom)){
            System.out.println(palindrom + " sayısı palindrom sayıdır.");
        } else
            System.out.println(palindrom + " sayısı palindrom sayı değildir.");
    }

    static boolean isPalindrom(int deger){
        int temp=deger, yeniSayi=0, sonBasamak;

        while (temp!=0){
            sonBasamak=temp%10;
            yeniSayi=(yeniSayi*10) + sonBasamak;
            temp/=10;
        }
        if (deger==yeniSayi){
            return true;
        } else
            return false;
    }
}
