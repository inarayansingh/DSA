public class basic {
    public static void main(String args[]){
         int arr[][]={{2,3,4},{5,6,7},{9,10,11}};
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
}
}
