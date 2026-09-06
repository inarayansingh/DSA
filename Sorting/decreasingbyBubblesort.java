public class decreasingbyBubblesort {
    public static void main(String[] args) {
        int arr[]={3,20,4,58,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    //Swapping
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
           
        }
         for(int ele:arr){
                System.out.print(ele+" ");
            }
    }
}
