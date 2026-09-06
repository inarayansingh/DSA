import java.util.*;
public class upperbound{
    public static void main(String[] args) {
        int arr[]={10,20,20,30,40,50,60,70};
        int n=arr.length;
        int up=n;
        int x=20;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (arr[mid]>x) {
                 up=Math.min(mid,up);
                 hi=mid-1;


                
            }else lo=mid+1;
           


        }
        System.out.println(up);
    }
}