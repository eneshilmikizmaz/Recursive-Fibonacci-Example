import java.util.Scanner;

public class Fibonacci {
    private int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public void writeFibSeries(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz : ");
        int n = scanner.nextInt();
        for (int i = 1 ;i<=n ; i++) {
            System.out.println(i+". eleman : "+ fib(i));
        }
    }
}
