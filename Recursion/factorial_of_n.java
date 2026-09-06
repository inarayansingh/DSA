import java.util.Scanner;

public class factorial_of_n{
    public static int fact(int n){

        if(n==1) return 1;
        int factorial= n*(fact(n-1));
        return factorial;
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
         int n=sc.nextInt();
          fact(n); 
          System.out.println(fact(n));
        
    }
}