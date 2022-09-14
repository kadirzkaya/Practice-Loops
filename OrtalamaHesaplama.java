import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int hedefSayi, sayiToplami=0, toplamSayi=-1;
        double ortalama;
        Scanner sc=new Scanner(System.in);

        System.out.println("Hedef bir sayı giriniz : ");
        hedefSayi=sc.nextInt();

        for (int i=0; i<hedefSayi;i++){
            if (i%3==0 && i%4==0){
                sayiToplami+=i;
                toplamSayi++;
            }
        }
        ortalama=sayiToplami/toplamSayi;
        System.out.println("Girilen sayıya kadar 3 ve 4'e bölünen sayıların ortalaması : "+ortalama);
    }
}
