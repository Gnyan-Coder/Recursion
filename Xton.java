import java.util.Scanner;

// Print x^n(stack height=n)



public class Xton {

    public static int calculate(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        // int xPow=calculate(x, n-1);
        // int xPown=x*xPow;
        return(x*calculate(x, n-1));
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x :");
        int x=sc.nextInt();
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        System.out.println(calculate(x, n));

        
    }
    
}
