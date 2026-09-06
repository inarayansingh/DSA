import org.w3c.dom.Node;

public class shollowcopynode {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        } 
    }
       
    public static void print(node a){
             node temp=a;
           while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

        
    }
    public static void main(String args[]){
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        node d=new node(40);
        node e=new node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
        // node temp=a;
        // for(int i=0;i<=5;i++){
        //     System.out.println(temp.val);
        //     temp=temp.next;


        // }
        print(a);
           
    }
}
