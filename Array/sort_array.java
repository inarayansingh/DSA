public class sort_array {
    public static void main(String args[]){
        int arr[]={0,1,0,1,0,1,0,1,1};
        int n=arr.length;
        int no0=0,no1=0;
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]==0) no0++;
            else{
                no1++;
            }
        }
        for(int i=0;i<no0;i++){
            arr[i]=0;   

        }
        for(int i=no0;i<n;i++){
            arr[i]=1;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

            }
}
