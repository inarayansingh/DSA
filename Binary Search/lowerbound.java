public class lowerbound {
    public static void main(String[] args) {
        int arr[]={10,20,20,30,40,50,60,70};
        int n=arr.length;
        // System.out.println(n);
        int lb=n;
        int x=20;
        int lo=0,hi=n-1;
        while(lo<=hi){

            int mid=(lo+hi)/2;
            if(arr[mid]>=x){
             lb=Math.min(mid,lb);
             hi=mid-1;
            }
            else {
                lo=mid+1;
            };
        }
        System.out.println("lower bound :="+lb);

    }
}
