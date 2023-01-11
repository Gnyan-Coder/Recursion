import java.util.Scanner;
public class Printnto1{
    public static void  printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        printNumbers(n);
        
    }
}