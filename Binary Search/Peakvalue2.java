public class Peakvalue2 {
    public static void main(String[] args) {
        int arr[]={11,228789,444,33,22,10,9};
        int lo=1;
        int n=arr.length;
        int hi=n-2;
        int m=0;
     
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                 m=mid;
                break;
              
            }
           else if(arr[mid]>arr[mid+1]) hi=mid-1;
           else if(arr[mid]>arr[mid-1]) lo=mid+1;
        }
          System.out.println(m);

    }
}
