package LinkedList;

public interface LinkedList {
	boolean add(ListNode node); // add to end
	void add(int index, ListNode node); 
	void addFirst(ListNode node);
	void addLast(ListNode node);
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
