public class nextGreatest {
    public static void main(String args[]){
        int arr[]={10,21,60,12,45,69,54};
        int n=arr.length;
        int ans[]=new int[n];
        ans[n-1]=-1;
        for(int i=0;i<n-1;i++){
            int mx=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                mx=Math.max(mx, arr[j]);
            }
            ans[i]=mx;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int brr:ans){
            System.out.print(brr+" ");
        }
        
    }
    
}
