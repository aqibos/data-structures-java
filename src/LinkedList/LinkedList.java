package LinkedList;

public interface LinkedList {
	boolean add(int n); // add to end
	void add(int index, int n); 
	void addFirst(int n);
	void addLast(int n);
	void clear();
	boolean contains(int n);
	ListNode get(int index);
	ListNode getFirst();
	ListNode getLast();
	int indexOf(int n);
	int remove(); // remove head
	int removeFirst();
	int removeLast();
	int remove(int index);
	int size();
	int [] toArray();
}
