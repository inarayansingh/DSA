public class zeroonetwo {
    public static void main(String args[]){
        int arr[]={0,1,2,0,1,2,1,1,0,0};
        int n=arr.length;
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)zero++;
            else if(arr[i]==1)one++;
            else two++;
        }
        System.out.println(zero+" "+one+" "+two);
        for(int j=0;j<n;j++){
            if(j<zero) arr[j]=0;
            else if(j<zero+one)arr[j]=1;
            else arr[j]=2;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    
    }
}
