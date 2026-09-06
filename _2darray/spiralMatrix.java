public class spiralMatrix{
    public static void main(String args[]){
        int arr[][]={{1,2,3,11},{4,5,6,66},{7,8,9,77},{10,11,12,99}};
        int m=arr.length;
        int n=arr[0].length;
        int minr=0, maxr=m-1;
        int minc=0, maxc=n-1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        while(minr<=maxr && minc<=maxc){
            //left to right
            for(int i=minc;i<=maxc;i++){
                System.out.print(arr[minr][i]+" ");
            }
            minr++;

            //top to bottom
            for(int j=minr;j<=maxr;j++){
                System.out.print(arr[j][maxc]+" ");
            }
            maxc--;

            //right to left
         
            for(int i=maxc;i>=minc;i--){
                System.out.print(arr[maxr][i]+" ");
            }
            maxr--;
            //bottom to top
           
            for(int j=maxr;j>=minr;j--){
                System.out.print(arr[j][minc]+" ");
            }
            minc++;
        }
    }
}