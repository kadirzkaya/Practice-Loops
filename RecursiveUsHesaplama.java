import java.util.Scanner;

public class RecursiveUsHesaplama {
    public static void main(String[] args) {
        int taban,us;
        Scanner sc=new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        taban=sc.nextInt();

        System.out.print("Üs değerini giriniz : ");
        us=sc.nextInt();

        System.out.println(usAl(taban,us));
    }

    static int usAl(int taban, int us){
        if (us==0){
            return 1;
        }else {
            return taban*usAl(taban,us-1);
        }
    }
}
