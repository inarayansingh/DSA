public class display_recrusivisly {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
   public static void print(Node a){
       if(a==null) return;
       print(a.next);
       System.out.println(a.val);
    }
    public static void main(String[] args) {
        Node a=new Node(45);
        Node b=new Node(10);
        Node c=new Node(50);
        Node d=new Node(70);
        Node e=new Node(44);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        print(a);


    }
}
