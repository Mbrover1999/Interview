public class LinkList {
    private Node first;
    private Node tail;

    private long size;


    public LinkList() {
        this.first = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insert(int value) {
        if (isEmpty()) {
            this.first = new Node(value);
            this.size ++;
        } else if (this.tail == null) {
            this.tail = new Node(value);
            this.first.next = this.tail;
            this.size ++;
        } else {
            this.tail.next = new Node(value);
            this.tail = tail.next;
            this.size++;
        }
    }

    public void display_list() {
        Node current = this.first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public void delete_node(int value) {
        Node current = this.first;
        Node previous = this.first;
        while (current != null) {
            if (current.value == value) {
                break;
            }
            previous = current;
            current = current.next;


        }
        if (current == null) {
            System.out.println("Have not found the item you want to delete");
        } else if (current == this.first){
            System.out.println("Deleted the first item which is " + this.first.value);
            this.first = this.first.next;
            this.size --;

        } else{
            System.out.println("Deleted an item which is " + current.value);
            previous.next = current.next;
            this.size --;

        }

    }
    public long size(){
        return this.size;
    }

    public Node find_node(int value) {
        Node current = this.first;
        while (current.value != value) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }



        }

        return current;
    }
}
