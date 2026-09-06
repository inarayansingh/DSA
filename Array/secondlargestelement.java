public class secondlargestelement {
    public static void main(String[] args) {
        int arr[]={1,42,70,5,9,34};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=max & arr[j]>smax){
                smax=arr[j];
            }

        }
        System.out.println(max);
        System.out.println(smax);
    }
}
