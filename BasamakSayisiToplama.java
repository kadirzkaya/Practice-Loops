import java.util.Scanner;

public class BasamakSayisiToplama {
    public static void main(String[] args) {
        int sayi, basamakSayisi=0, sonuc=0, kalanSayi;

        Scanner sc=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        sayi=sc.nextInt();

        for (int i=1;i<=sayi;i*=10){
            if (sayi>=i){
                basamakSayisi++;
            }
        }
        for (int j=basamakSayisi-1;j>=0;j--){
            kalanSayi= (int) ( sayi/Math.pow(10,j));
            sonuc+=kalanSayi;
            sayi=(int)(sayi-kalanSayi*Math.pow(10,j));
        }

        System.out.println(sayi + " sayısının basamak değerleri toplamı " + sonuc);

    }
}
