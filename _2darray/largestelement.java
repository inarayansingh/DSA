public class largestelement {
    public static void main(String args[]){
     int arr[][]={{1,2,3},{56,999,78},{23,89,56}};
     int mx=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
              mx=Math.max(arr[i][j],mx);
        }
     }
     System.out.println(mx);
    }
}
