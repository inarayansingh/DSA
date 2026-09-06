import java.util.Scanner;

public class sumofn {
    public static void sum(int n,int sum){
        if(n==0){
            System.out.print(sum);
            return ;
        }
        sum(n-1,sum+n);
        
    
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sum(n,0);
    }
}
