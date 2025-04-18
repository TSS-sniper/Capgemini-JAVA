package Day23.Case_Study_HashMap;

class Ct {

	class Node {
		Product key;
		Integer value;
		Node next;

		public Node(Product key, Integer quantity) {
			this.key = key;
			this.value = quantity;
		}

	}

	private Node[] buckets;
	private int capacity = 12;
	private int size;

	public Ct() {
		buckets = new Node[capacity];
		size = 0;
	}

	private int getIndex(Product key) {
		return Math.abs(key.hashCode() % capacity);
	}

	public void addProduct(Product key, Integer value) {

		int index = getIndex(key);

		Node head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		Node newNode = new Node(key, value);
		newNode.next = buckets[index];
		buckets[index] = newNode;
		size++;
	}

	public Integer displayCart(Product key) {
		int index = getIndex(key);
		Node head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				System.out.println(key);
				return head.value;
			}
			head = head.next;

		}
		return null;
	}

	public void totalCart() {
		for (int i = 0; i < buckets.length; i++) {
			Node head = buckets[i];
			while(head!=null) {
				System.out.println(head.key+" : "+head.value);
				head= head.next;
			}
		}
	}

	public Integer removeProduct(Product key) {
		int index = getIndex(key);
		Node head = buckets[index];
		Node prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				if (prev == null) {
					buckets[index] = head.next;
				} else {
					prev.next = head.next;
				}
				size--;
				System.out.println(key);
				return head.value;
			}

			prev = head;
			head = head.next;

		}

		return null;
	}

}

public class cart {
	public static void main(String[] args) {
		Product p1 = new Product(1, "A", 100d);
		Product p2 = new Product(2, "B", 200d);
		Product p3 = new Product(3, "C", 300d);
		Product p4 = new Product(4, "D", 400d);
		Product p5 = new Product(5, "E", 500d);

		Ct c = new Ct();
		c.addProduct(p1, 10);
		c.addProduct(p2, 40);
		c.addProduct(p3, 50);
		c.addProduct(p4, 30);
		c.addProduct(p5, 70);

		//System.out.println("Quantity "+c.displayCart(p1));
		System.out.println("Total products in the Cart:");
		c.totalCart();
		//System.out.println(c.removeProduct(p2));
		//System.out.println("Quantity "+c.displayCart(p2));

	}
}
