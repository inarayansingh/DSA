public class printArrayElement {
    static void print(int n,int arr[]){
        if(n==arr.length) return;
        System.out.print(arr[n]+" ");
        print(n+1, arr);
    }
    public static void main(String[] args) {
        int arr[]={10,20,40,30,50,20};
        print(0,arr);

    }
}
