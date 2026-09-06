import java.util.Scanner;

public class inputstringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        StringBuilder c= new StringBuilder(sc.nextLine());
        System.out.println(ab);
        System.out.println(c);
    }
}
