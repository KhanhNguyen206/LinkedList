public class LinkedList {
    private Node head;
    private int numNodes=0;

    public int getNumNodes() {
        return numNodes;
    }

    public class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }

        public Object getData(){
            return data;
        }
    }

    public void addFirst(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numNodes++;
    }

    public void addLast (Object data){
        Node temp=head;

        for (int i=0; i<numNodes-1; i++){
            temp=temp.next;
        }

        temp.next=new Node(data);
        numNodes++;
    }

    public void add(Integer index, Object data){
        Node temp=head;

        for (int i=0; i<index-1; i++){
            temp=temp.next;
        }

        Node holder= temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numNodes++;
    }

    public void remove(Integer index){
        Node temp=head;

        for (int i=0; i<index-1; i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
        numNodes--;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Object get(int index){
        Node temp = head;
        for (int i=0; i<index-1; i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public int getSize(){
        return getNumNodes();
    }
}
