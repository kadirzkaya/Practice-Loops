import java.util.Scanner;

public class GirilenSayiToplami {
    public static void main(String[] args) {
        int girilenSayi, sayiToplami=0;
        boolean isBreak=true;

        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            girilenSayi=sc.nextInt();
            if (girilenSayi%2!=0){
                isBreak=false;
            }else if (girilenSayi%4==0){
                sayiToplami+=girilenSayi;
            }
        }while (isBreak);

        System.out.println("Girilen sayılardan 4'ün katı olan sayıların toplamı : "+sayiToplami);
    }
}
