import java.util.Scanner;

public class Sumnaturalsnumbers {
    public static void sumNaturals(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }else{
            sum=sum+i;
            sumNaturals(i+1,n,sum);

        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers :");
        int n=sc.nextInt();
        sumNaturals(1, n, 0);


    }
}
