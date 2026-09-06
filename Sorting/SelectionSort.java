public class SelectionSort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;

                }
            }
            swap(arr,i,mindex);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
