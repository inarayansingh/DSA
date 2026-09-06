public class fpandlp{
    public static void main(String[] args) {
        int arr[]={10,20,20,20,20,20,20,30,40,50,60};
        int target=20;
        int n=arr.length;
        int lo=0, hi=n-1;
        int lb=n;
        //for lower bound
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=target){
                hi=mid-1;
                lb=Math.min(mid,n);
            }
            else{
                lo=mid+1;

            }
           
        }
         System.out.println(lb);
         //for upper bound
         lo=0;
         hi=n-1;
         int ub=n;
         while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>target){
                hi=mid-1;
                ub=Math.min(mid,n);
            }
            else{
                lo=mid+1;
            }
        
         }
              System.out.println(ub);
              System.out.println("First position "+lb);
              System.out.println("Last position "+(ub-1));
              System.out.println("Number of Occurrence "+(ub-lb));
        

    }

}
   