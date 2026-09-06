import java.util.Scanner;
public class countall_vowel {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int count=0;
     
        for(int j=0;j<s.length();j++){
              if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='o'||s.charAt(j)=='i'||s.charAt(j)=='u')
            count++;
         }
        System.out.println(count);
       
    }
}
