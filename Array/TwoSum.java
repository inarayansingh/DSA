public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,3,9};
        int x=9;
        System.out.println(arr.length);
       
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                  
             
                    System.out.println(arr[i]+" "+arr[j]);
                    System.out.println(i+" "+j);
                   
                }
              
            }
        
        
    }
     
}
}
