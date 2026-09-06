public class passing_arraymethod {
    public static void main(String[] args) {
        int[] x={5};
          System.out.println(x[0]);
        change(x);
       // x=x+5;
         System.out.println(x[0]);
        

    }
     public static void  change(int[] x){
            x[0]=90;
     }
       
}
