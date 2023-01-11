import java.util.Scanner;

public class Print1ton {

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int n=sc.nextInt();
        printNumbers(n);

    }
}
