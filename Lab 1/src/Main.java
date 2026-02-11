import.java.util.Scanner;
public class Main {
    public static LinkedList CMult(LinkedList L1) {
        LinkedList L2 = new LinkedList();
        int product = 1;

        Node current = L1.head;

        while (current != null) {
            product *= current.data;
            L2.add(product);
            current = current.next;
        }

        return L2;
    }

    public static LinkedList mergeAlternate(LinkedList a, LinkedList b) {
        LinkedList result = new LinkedList();

        Node p1 = a.head;
        Node p2 = b.head;

        while (p1 != null && p2 != null) {
            result.add(p1.data);
            result.add(p2.data);
            p1 = p1.next;
            p2 = p2.next;
        }

        while (p1 != null) {
            result.add(p1.data);
            p1 = p1.next;
        }

        while (p2 != null) {
            result.add(p2.data);
            p2 = p2.next;
        }

        return result;
    }
    public static boolean inSubstack(LinkedList a, LinkedList b) {
        return subsetOneWay(a, b) || subsetOneWay(b, a);
    }

    private static boolean subsetOneWay(LinkedList small, LinkedList big) {
        Node current = small.head;

        while (current != null) {
            if (!big.contains(current.data))
                return false;

            current = current.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
		//problem 1
        L1.add(2);
        L1.add(3);
        L1.add(4);

        LinkedList L2 = CMult(L1);

        System.out.println("Original: " + L1);
        System.out.println("CMult: " + L2);
		//problem 2
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(5);
        list1.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(7);
        list2.add(13);
        list2.add(1);

        LinkedList merged = mergeAlternate(list1, list2);
        System.out.println("Merged: " + merged)
		//problem 3
        LinkedList a = new LinkedList();
        a.add(1);
        a.add(5);

        LinkedList b = new LinkedList();
        b.add(1);
        b.add(5);
        b.add(3);

        System.out.println("Subset? " + inSubstack(a, b));
    }
}
