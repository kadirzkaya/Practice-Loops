import java.util.Scanner;

public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        int harmonik;
        double total=0.0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Hesaplanacak harmonik sayıyı giriniz : ");
        harmonik=sc.nextInt();

        for (int i=1; i<=harmonik;i++){
            total+= (1.0/i);
        }

        System.out.println(harmonik + " sayısının harmonik seri değeri : "+ total);
    }
}
