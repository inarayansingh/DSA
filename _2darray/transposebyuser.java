package _2darray;

import java.util.Scanner;

public class transposebyuser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows: ");
        int r=sc.nextInt();
        System.out.println("Enter column: ");
        int c=sc.nextInt();
        
        //taking data from user
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int brr[][]=new int[c][r];
        //storing into another matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                brr[j][i]=arr[i][j];
            }
        }
        //printing
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }


        
    }
    
}
