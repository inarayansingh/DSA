// import shollowcopynode.node;

public class dispalyingRecursively {
    public static  class nodes{
        int val;
        nodes next;
        nodes(int val){
            this.val=val;
        }
    }
      
    public static void dispalyingRecursively (nodes a) {
        if(a==null) return;
        //dispalyingRecursively(a.next);
        dispalyingRecursively(a.next);
        System.out.println(a.val);
        
    }
    public static void main(String args[]){
        nodes a=new nodes(10);
        nodes b=new nodes(20);
        nodes c=new nodes(30);
        nodes d=new nodes(40);
        nodes e=new nodes(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // System.out.println(a);
        // System.out.println(a.val);
        // System.out.println(b.next.next.val);
        dispalyingRecursively(a);
        

    }
}
