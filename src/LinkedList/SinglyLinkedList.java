package LinkedList;

public class SinglyLinkedList implements LinkedList {
	private ListNode head;
	private int size;

	public SinglyLinkedList(){
		this.size = 0;
	}

	@Override
	public boolean add(int n) {
		add(size, n);
		return true;
	}

	@Override
	public void add(int index, int n) {
		if (index > this.size) return;

		ListNode p = this.head;
		ListNode toAdd = new ListNode(n);

		if (this.isEmpty() || index == 0) {
			this.head = toAdd;
			this.head.setNext(p);
		} else {
			int count = 1;
			while (p != null) {
				if (count == index) {
					ListNode tmp = p.getNext();
					p.setNext(toAdd);
					toAdd.setNext(tmp);
				}
				count++;
				p = p.getNext();	
			}
		}
		size++;
	}

	@Override
	public void addFirst(int n) {
		add(0, n);
	}

	@Override
	public void addLast(int n) {
		add(size, n);
	}

	@Override
	public void clear() {
		this.head = null;
		size = 0;
	}

	@Override
	public boolean contains(int n) {
		return indexOf(n) >= 0;
	}

	@Override
	public ListNode get(int index) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ListNode getFirst() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ListNode getLast() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	// -1, if not foundd
	@Override
	public int indexOf(int n) {
		ListNode p = this.head;
		int index = -1;
		int count = 0;
		while (p != null) {
			if (p.getData() == n) {
				index = count; break;
			}

			p = p.getNext();
			count++;
		}
		return index;
	}

	@Override
	public int remove() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int removeFirst() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int removeLast() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int remove(int index) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public String toString() {
		String listAsString = "["; 
		ListNode p = this.head;
		while (p != null) {
			listAsString += p.getData() + ", ";  // TODO: remove trailing comma
			p = p.getNext();
		}
		listAsString += "]"; 
		return listAsString;
	}

	public void printString() {
		System.out.println(this.toString());	
	}

	@Override
	public int[] toArray() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
