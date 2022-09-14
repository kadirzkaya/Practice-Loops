import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        int sayi1, sayi2, ebob=1, ekok, enBuyuk,bolmeSayisi=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        sayi1=sc.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        sayi2=sc.nextInt();

        if (sayi1>sayi2){
            enBuyuk=sayi1;
        }else
            enBuyuk=sayi2;

        while (enBuyuk>=bolmeSayisi){
            if (sayi1%bolmeSayisi==0 && sayi2%bolmeSayisi==0){
                ebob=bolmeSayisi;
            }
            bolmeSayisi++;
        }
        ekok=(sayi1*sayi2)/ebob;

        System.out.println(sayi1 +" ve "+sayi2+ " sayılarının ebobu: "+ ebob+ " ekoku : "+ekok);

    }
}
