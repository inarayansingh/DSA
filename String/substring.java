public class substring {
    public static void main(String args[]){
        String s="abcd";
       System.out.println(s.substring(2));// this gets from  i to end
       System.out.println(s.substring(0,3)); //this gets part of string from i to j-1
        for(int i=0;i<s.length();i++){
           for(int j=i+1;j<=s.length();j++){
            System.out.println(s.substring(i, j));
           }
       
       }
       
    }
}
