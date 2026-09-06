public class passing_array{
    public static void main(String args[]){
     int arr[]={10,20,30,40,50,60};
     System.out.println(arr[0]);
     change(arr);
     for(int ele:arr){
        System.out.print(ele+" ");
     }
    }
    public static void change(int arr[]){
        arr[0]=90;
        arr[4]=80;
     }
}