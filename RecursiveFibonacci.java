public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

    static int Fibonacci(int n){
        if (n==1 || n==2)
            return 1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
