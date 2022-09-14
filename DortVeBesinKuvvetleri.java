import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int hedefSayi;
        Scanner sc =new Scanner(System.in);
        System.out.print("Hedef sayiyi giriniz : ");
        hedefSayi=sc.nextInt();

        for (int i=1;i<hedefSayi;i*=4){
            System.out.println(hedefSayi + " sayısına kadar olan 4'ün kuvvetleri "+i);
        }

        System.out.println();

        for (int i=1;i<hedefSayi;i*=5){
            System.out.println(hedefSayi + " sayısına kadar olan 5'in kuvvetleri "+i);
        }
    }
}
