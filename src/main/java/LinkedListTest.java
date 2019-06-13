public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        linkedList.printList();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.get(3));
    }
}
