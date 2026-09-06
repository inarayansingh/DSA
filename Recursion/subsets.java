public class subsets {
    static void subset(int n,String s){
        if(n==s.length()) {
            return;
        }
       
        subset(n+1, s);
        subset(n, s);
    }
    public static void main(String[] args) {
        String s="abc";
        subset(0,s);
    }
}
