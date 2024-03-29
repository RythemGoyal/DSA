public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next=null;
        Node temp = head;

        if(head == null){
            insertFirst(val);
            return;
        }
        while(temp.next!=null){
            temp = temp.next;
        }

        node.prev = temp;
        temp.next=node;

    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int val, int after){
        Node p = find(after);

        if(p==null){
            System.out.println("Node does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node temp = head;
        Node last= null;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println("\nPrint in Reverse");

        while(last!=null){
            System.out.print(last.value + " -> ");
            last=last.prev;
        }
        System.out.print("Start");
        System.out.println();
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
