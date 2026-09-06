public class prime {
    public static void main(String[] args) {
        int k=2;
    boolean flag=true;
    for(int i=2;i<k/2;i++){
       if(k%i==0){
       // boolean flag=false;
       System.out.print("not prime ");
       flag=false;
        break;
       }
       
      
    }
    if(flag==true) System.out.println("prime number");
   
}
}
