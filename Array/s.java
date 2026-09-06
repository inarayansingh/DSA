public class s {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,2,1,2,0,0,1};
        int n=arr.length;
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            else if(arr[i]==1)one++;
            else two++;
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
            
        }
        for(int i=zero;i<one;i++){
            arr[i]=1;

        }
        for(int i=one;i<n-1;i++){
            arr[i]=2;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
