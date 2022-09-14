import java.util.Scanner;

public class MinMaxDegerleriBulma {
    public static void main(String[] args) {
        int girilecekSayiAdedi,min=10000,max=0,sayi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        girilecekSayiAdedi=sc.nextInt();

        for (int i=0;i<girilecekSayiAdedi;i++){
            System.out.print((i+1) +". sayıyı giriniz : ");
            sayi=sc.nextInt();
            if (i==0){
                max=sayi;
                min=sayi;
            }
            if (sayi>max){
                max=sayi;
            }else if (sayi<min){
                min=sayi;
            }
        }

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
