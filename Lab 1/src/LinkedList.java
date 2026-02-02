public class LinkedList {
    Node head;
    // Creating a constructor where head = null
    public LinkedList(){
        head = null;
    }
    public void add (int data){
        Node newNode = new Node(data);
        if (head ==null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;

        }
        current.next = newNode;
    }
    public boolean contains (int value){
        Node current = head;
        while (current != null){
            if (current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
@Override
public String toString(){
    String result = "[";
    Node current = head;
    while (current != null) {
        result += current.data;
        if (current.next != null){
            result += ", ";
        }
        current = current.next;
    }
    result += "]";
    return result;
    }
}
