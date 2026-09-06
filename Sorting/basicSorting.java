import java.util.*;
public class basicSorting {
    public static void print(int arr[]){
             for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,0,50,3,1};
        int n=arr.length;
        Arrays.sort(arr);  //inbuilt method
        print(arr);
    }
    
}
