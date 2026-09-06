public class linearSearch {
    public static void main(String args[]){
        int arr[]={2,4,3,6,1};
        int n=arr.length;
        int tar=1;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                System.out.print("Target found");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.print("target not found");
        }
    }
}
