public class implentation {
    static  class node{
        int val;
        node next;
        node (int val){
            this.val=val;
        }
    }
    static class sll{
        node head;
        node tail;
        int size;

         void insertatend(int val){
          
      node temp =new node(val);
        if(head==null){
            head=tail=temp;
         }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
     }
     void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
        
     }
      void size(){
        System.out.println("size of the linked list:-"+ size);
     }
    
     }
     
      
    
     
    
    public static void main(String args[]){
    sll ll= new sll();
    ll.insertatend(10);
    ll.display();
    ll.insertatend(30);
    ll.insertatend(60);
    ll.insertatend(20);
    ll.display();
    ll.size();

    }
}
