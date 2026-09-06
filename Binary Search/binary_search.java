import java.util.*;
public class binary_search {
   
    public static void main(String[] args) {
        int arr[]={1,32,43,6,7,3,34,80,55};
        int n=arr.length;
        int tar=80;
        int lo=0,hi=n-1;
        Arrays.sort(arr);
        boolean flag=false;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<tar){
                lo=mid+1;
            }
            else if(arr[mid]>tar){
                hi=mid-1;
            }
            else if( arr[mid]==tar){
                flag=true;
                System.out.print("target found");
                break;


            }
            
        }
        if(!flag){
            System.out.print("target not found");
        }
      
    }
}
