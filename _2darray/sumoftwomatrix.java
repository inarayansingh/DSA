public class sumoftwomatrix {
    public static void  main(String args[]){
        int arr[][]={{1,2,3},{4,5,6}};
        int brr[][]={{1,2,3},{4,5,6}};
        int n=arr.length;
        int m=brr[0].length;

        int r[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                r[i][j]=arr[i][j]+brr[i][j];
            
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}
