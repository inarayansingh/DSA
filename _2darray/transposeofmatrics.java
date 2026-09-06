package _2darray;

public class transposeofmatrics {
    public static void main(String args[]){
        int [][]a={{1,2},{3,4},{5,6}};

        int n=a.length;
        int m=a[0].length;

        // System.out.println(n);
        // System.out.println(m);

        int [][]transpose=new int [m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               transpose[j][i]=a[i][j];
            }
          
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
          
        }
        
         
    }
}
