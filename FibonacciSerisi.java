import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int seriSayisi,ilk, son=1,seriToplam=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi sayısını giriniz :");
        seriSayisi = sc.nextInt();

        for (int i=0;i<=seriSayisi;i++){
            System.out.println(seriToplam +" ");

            ilk=son;
            son=seriToplam;
            seriToplam=ilk+son;

        }

    }
}
