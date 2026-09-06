import java.util.Collections;

class kth_nearest {
    public static void main(String args[]){
     int arr[]={10,20,30,40,50,60,70};
        int n=arr.length;
        int x=50;
        int k=3;

        if(x<arr[0]){
            for(int i=0;i<k;i++){
                System.out.println(arr[i]) ;
            }
           
        }
        if(x>arr[n-1]){
            for(int i=n-1;i>=n-k;i--){
                System.out.println(arr[i]) ;
            }
            Collections.sort(ans);
            return ans;
        }
        int lo=0;
        int hi=n-1;
         int lb=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
            int j=lb;
        int i=lb-1;
    
        while(k>0 && i>=0 &&j<n){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
                
            }else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
           ans.add(arr[j]) ;
           j++;
           k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}