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
	public static LinkedList mergeAlternate(LinkedList a, LinkedList b){
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
}