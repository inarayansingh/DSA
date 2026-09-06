public class Searchinrotatedshorted {
    public static void main(String[] args) {
       
    int arr[]={4,5,6,7,0,1,2};
    int target=5;
    int n=arr.length;
    int lo=0;
    int hi=n-1;
    boolean flag=false;
    while(lo<=hi){
       int mid=lo+(hi-lo)/2;
       if(arr[mid]== target){
        System.out.println(mid);
        flag=true;
        break;
       }
       else if(arr[mid]<arr[hi]){
            if(target<=arr[hi] && target>=arr[mid+1]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
       }
       else{
       if( target>=arr[lo]&& target <arr[mid-1]){
        hi=mid-1;
       }
       else{
        lo=mid+1;
       }
       }
       
    }
     if(flag==false)System.out.println("not found");
    
}
}
