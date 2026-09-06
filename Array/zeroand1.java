public class zeroand1 {
    public static void main(String args[]){
        int arr[]={0,1,0,1,0,0,0,1,1,1,1,0,0,1};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0)i++;
            if(arr[j]==1)j--;
            if( i<j & arr[i]==1 & arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
