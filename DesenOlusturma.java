import java.util.Scanner;

public class DesenOlusturma {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("N sayısı : ");
        n = sc.nextInt();
        desenCiz(n, n, false);
    }

    static void desenCiz(int n, int x, boolean m) {
        if (n < 0 || n == 0 || m) {
            if (n <= x) {
                System.out.print(n + " ");
                desenCiz(n + 5, x, true);
            } else {
                System.out.println();
            }
        } else {
            System.out.print(n + " ");
            desenCiz(n - 5, x, false);
        }
    }
}
