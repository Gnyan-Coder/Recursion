import java.util.Scanner;

public class Factorials {

    public static int facotrilaNumber(int n){
        if(n==0){
            return 1;
        }
        return(n*facotrilaNumber(n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n=sc.nextInt();
        int fact=facotrilaNumber(n);
        System.out.println(fact);
    }
}
