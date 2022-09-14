import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int taban, us, sonuc=1;

        Scanner sc=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        taban=sc.nextInt();

        System.out.print("Üs olacak sayıyı giriniz : ");
        us=sc.nextInt();
        for (int i=0; i<us;i++){
            sonuc*=taban;
        }

        System.out.println(taban + " üssü " + us +" = "+ sonuc);
    }
}
