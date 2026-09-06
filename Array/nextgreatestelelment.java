public class nextgreatestelelment {
    public static void main(String args[]){
        int arr[]={12,43,65,11,10,56,33};
        int n=arr.length;
        int ans[]=new int[n];
        ans[n-1]=-1;
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge, arr[i]);
           
           
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int a:ans){
            System.out.print(a+" ");
        }
    }
}
