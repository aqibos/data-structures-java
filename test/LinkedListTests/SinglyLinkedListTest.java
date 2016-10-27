package LinkedListTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import LinkedList.SinglyLinkedList;

public class SinglyLinkedListTest {
	
	private SinglyLinkedList list;
	private SinglyLinkedList filledList;

	public SinglyLinkedListTest() {}
	
	@BeforeClass
	public static void setUpClass() {}

	@AfterClass
	public static void tearDownClass() {}
	
	@Before
	public void setUp() {
		this.list = new SinglyLinkedList();
		this.filledList = new SinglyLinkedList();
		filledList.add(1);
		filledList.add(2);
		filledList.add(3);
	}
	
	@After
	public void tearDown() {
		this.list = null;
		this.filledList = null;
	}

	@Test
	public void testAdd() {
		int firstAdd = 4;
		int secondAdd = 6;

		assertEquals(true, list.isEmpty()); 			   // List is empty in beginning	
		list.add(firstAdd);                          // Add int 
		assertEquals(1, list.size());                // Check size is 1
		assertEquals(true, list.contains(firstAdd)); // Check list contains int

		list.add(secondAdd);                          // Add int 
		assertEquals(2, list.size());       		      // Check size is 1
		assertEquals(true, list.contains(secondAdd)); // Check list contains int

		assertEquals(0, list.indexOf(firstAdd));  		// Check positions
		assertEquals(1, list.indexOf(secondAdd));
	}

	@Test
	public void testAddAtIndex(){
		int firstAdd  = 2;
		int secondAdd = 4;
		int thirdAdd  = 6;
		int fourthAdd = 8;
		int noAdd = 10;

		assertEquals(true, list.isEmpty());
		list.add(0, firstAdd);
		assertEquals(1, list.size());
		assertEquals(true, list.contains(firstAdd));

		list.add(1, secondAdd);
		assertEquals(2, list.size());
		assertEquals(true, list.contains(secondAdd));

		list.add(1, thirdAdd);
		assertEquals(3, list.size());
		assertEquals(true, list.contains(thirdAdd));

		list.add(1, fourthAdd);
		assertEquals(4, list.size());
		assertEquals(true, list.contains(fourthAdd));

		list.add(99, noAdd);
		assertEquals(4, list.size());
		assertEquals(false, list.contains(noAdd));
		
		assertEquals(0, list.indexOf(firstAdd));
		assertEquals(3, list.indexOf(secondAdd));
		assertEquals(2, list.indexOf(thirdAdd));
		assertEquals(1, list.indexOf(fourthAdd));
		assertEquals(-1, list.indexOf(noAdd));
	}		
	
	@Test
	public void testAddFirst() {
		int firstAdd  = 2;
		int secondAdd = 4;
		int thirdAdd  = 6;

		assertEquals(true, list.isEmpty());
		list.addFirst(firstAdd);
		assertEquals(1, list.size());
		assertEquals(true, list.contains(firstAdd));

		list.addFirst(secondAdd);
		assertEquals(2, list.size());
		assertEquals(true, list.contains(secondAdd));

		list.addFirst(thirdAdd);
		assertEquals(3, list.size());
		assertEquals(true, list.contains(thirdAdd));

		assertEquals(2, list.indexOf(firstAdd));
		assertEquals(1, list.indexOf(secondAdd));
		assertEquals(0, list.indexOf(thirdAdd));
	}

	@Test
	public void testAddLast() {
		int firstAdd  = 2;
		int secondAdd = 4;
		int thirdAdd  = 6;

		assertEquals(true, list.isEmpty());
		list.addLast(firstAdd);
		assertEquals(1, list.size());
		assertEquals(true, list.contains(firstAdd));

		list.addLast(secondAdd);
		assertEquals(2, list.size());
		assertEquals(true, list.contains(secondAdd));

		list.addLast(thirdAdd);
		assertEquals(3, list.size());
		assertEquals(true, list.contains(thirdAdd));

		assertEquals(0, list.indexOf(firstAdd));
		assertEquals(1, list.indexOf(secondAdd));
		assertEquals(2, list.indexOf(thirdAdd));
	}

	@Test
	public void testClear() {
		int toAdd = 2;

		list.add(toAdd);
		list.add(toAdd);
		list.add(toAdd);

		list.clear();
		assertEquals(0, list.size());
	}

	@Test
	public void testContains() {
		int firstAdd  = 2;	
		int secondAdd = 4;
		int noAdd = 6;

		list.add(firstAdd);
		assertEquals(true, list.contains(firstAdd));
		list.add(secondAdd);
		assertEquals(true, list.contains(secondAdd));
		assertEquals(false, list.contains(noAdd));
	}

	@Test
	public void testGet() {
	}

	@Test
	public void testGetFirst() {
	}

	@Test
	public void testGetLast() {
	}
	
	@Test
	public void testIndexOf() {
	}

	@Test
	public void testRemove() {
	}

	@Test
	public void testRemoveFirst() {
	}

	@Test
	public void testRemoveLast() {
	}

	@Test
	public void testRemoveIndex() {
	}

	@Test
	public void testSize() {
	}

	@Test
	public void testIsEmpty() {
	}

	@Test
	public void testToString() {
	}

	@Test
	public void testToArray() {
	}
}
