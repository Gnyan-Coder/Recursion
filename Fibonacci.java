import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciNumber(int start,int second,int n){
        int fib=start+second;
        if(n==0){
            return;
        }
        System.out.println(fib);
        fibonacciNumber(second, fib,n-1);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int start=0;
        int second=1;
      System.out.println(start);
      System.out.println(second);
      fibonacciNumber(start, second, n-2);
        
    }
}
