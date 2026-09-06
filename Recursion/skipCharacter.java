public class skipCharacter {
    static void skip(int n,String s,String ans){
        if(n==s.length()){
        System.out.println(ans);
        return;
        } 
        if(s.charAt(n)!='a'){
            ans+=s.charAt(n);
        }
        skip(n+1, s, ans);

    }
    public static void main(String[] args) {
        String s="Narayan";
        skip(0, s, "");

    }
}
