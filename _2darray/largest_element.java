  package _2darray;

public class largest_element {
    public static void main(String args[]){
        int arr[][]={{1,21,2},{3,93,4},{56,30,45}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println("The largest:"+ max);
    }
}
