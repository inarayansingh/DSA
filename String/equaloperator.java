public class equaloperator {
    public static void main(String args[]){
        String s="abcyz";
        String t="abc";
        t=t+"yz";
        System.out.println(s.equals(t));
        System.out.println(s==t);
    }
}
