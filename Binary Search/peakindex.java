public class peakindex{
    public static void main(String[] args) {
        int arr[]={1,2,300,4,3,2};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                System.out.println(i);
            }
        }
    }
}