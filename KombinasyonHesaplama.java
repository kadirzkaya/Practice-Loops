import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int elemanSayisi, grupSayisi, n=1, r=1,farkFac=1;
        double sonuc;

        Scanner sc=new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz : ");
        elemanSayisi=sc.nextInt();

        System.out.print("Oluşturulacak grup sayısını giriniz : ");
        grupSayisi=sc.nextInt();

        for (int i=1;i<=elemanSayisi;i++){
            n*=i;
        }

        for (int i=1;i<=grupSayisi;i++){
            r*=i;
        }

        for (int i=1;i<=(elemanSayisi-grupSayisi);i++){
            farkFac*=i;
        }

        sonuc=n/(r*farkFac);

        System.out.println("C("+ elemanSayisi +"," + grupSayisi + ") sonucu : " + sonuc);
    }
}
