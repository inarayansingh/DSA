public class MarskOfStudent {
    public static void main(String[] args) {
        int arr[]={21,56,75,33,30,100};
        for(int i=0;i<arr.length;i++){
           if(arr[i]<=33){
            System.out.println(i+" ");
           }
        }
    }
}
//print the roll number of tose student whose marks is less than 33 and it considered fail.