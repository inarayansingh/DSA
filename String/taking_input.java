import java.util.Scanner;
public class taking_input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter string: ");
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(s.length()); //for length
        System.out.println(s.charAt(3));
    }
}
