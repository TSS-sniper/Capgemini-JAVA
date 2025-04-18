package Day23.HashMap;

public class hashmap {

	private class Node {

		Integer key;
		String value;
		Node next;

		Node(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private Node[] buckets;
	private int capacity = 12;
	int size = 0;
	private float loadFactor=0.75f;

	public hashmap() {
		buckets = new Node[capacity];
	}

	private int getIndex(Integer key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(Integer key, String value) {
		int index = getIndex(key);
		Node head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) { //if key is same, value is updated else if key is diff then new entry is added...
				head.value = value;
				return;
			}
			head = head.next;
		}
		Node newNode = new Node(key, value);
		newNode.next = buckets[index];
		buckets[index] = newNode;
		size++;
		if(size>=loadFactor*capacity) {
			reSize();
		}
	}

	public String get(Integer key) {
		int index = getIndex(key);
		Node head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public void reSize() {
		System.out.println("Resizing the Array");
		Node [] oldValues = buckets;
		capacity*=2;
		buckets = new Node[capacity];
		size=0;
		for (int i = 0; i < oldValues.length; i++) {
			Node head = oldValues[i];
			while(head!=null) {
				put(head.key,head.value);
				head=head.next;
			}
		}
	}
	
	public String remove(Integer key) {
		int index = getIndex(key);
		Node head = buckets[index];
		Node previous = null;
		while (head!=null) {
			if(head.key.equals(key)) {
				if(previous==null) {
					buckets[index]=head.next;
				}
				else {
					previous.next=head.next;
				}
				size--;
				return head.value;
			}
			previous=head;
			head=head.next;
		}
		return null;
		
	}
	}