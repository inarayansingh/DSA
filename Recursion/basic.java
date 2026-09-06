import java.util.Scanner;

public class basic {
    public static void sum(int x,int sum){
        if(x==0){
            System.out.println(sum);
            return;
        }
        sum(x-1,sum+x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=sc.nextInt();
        sum(x,0);
    }
  }
    
