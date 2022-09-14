import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int mukemmelSayi,total=0;
        String result;
        Scanner sc= new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        mukemmelSayi=sc.nextInt();

        for (int i=1;i<=mukemmelSayi/2;i++){
            if (mukemmelSayi%i==0){
                total+=i;
            }
        }

        result=(total==mukemmelSayi)? mukemmelSayi+" bir mükemmel sayıdır." : mukemmelSayi + " mükemmel sayı değildir.";
        System.out.println(result);
    }
}
