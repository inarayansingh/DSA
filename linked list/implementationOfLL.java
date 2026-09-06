public class implementationOfLL {

    // Node class
    static class node {
        int val;
        node next;

        node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Singly Linked List
    static class sll {
        node head;
        node tail;

        void insertAtEnd(int val) {
            node temp = new node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        sll ll = new sll();
        ll.insertAtEnd(10);
        ll.insertAtEnd(30);
        ll.insertAtEnd(50);
        ll.display();
    }
}
