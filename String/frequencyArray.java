package string;

import java.util.ArrayList;
import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int idx=(int) ch-97;
            freq[idx]++;

        }
        int max=-1;
        for(int i=0;i<freq.length;i++){
            max=Math.max(freq[i],max);
        }
        for(int i=0;i<freq.length;i++){
           if(max==freq[i]){
            char ch=(char) (i+97);
             System.out.print(ch+" ");
           }
        }
    }
}
