public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//
//        list.insertEnd(4);
//
//        list.insert(5,4);
//
//        list.insert(6,2);
//        list.display();
//
//        System.out.println("Deleted element " +list.deleteFirst());
//        list.display();
//
//        System.out.println("Deleted element " + list.deleteLast());
//        list.display();
//
//        System.out.println("Deleted element "+ list.delete(2));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.display();
//
//        list.insertLast(4);
//        list.display();
//
//        list.insert(6,2);
//        list.display();

        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
        list.delete(3);
        list.display();
    }
}
