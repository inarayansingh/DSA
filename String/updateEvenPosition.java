public class updateEvenPosition {
    public static void main(String args[]){
        String s="kishan";
        String n="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                n+='a';
            }
            else{
              n+=  s.charAt(i);
            }

        }
       
        System.out.println(n);
    }
}
