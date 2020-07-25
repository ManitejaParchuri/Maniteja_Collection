package collections;

import static org.junit.Assert.*;


import org.junit.Test;

public class CustomCollectionTest {

	@Test
	public void test1() {
		List<Integer> myList=new List<Integer>();
		assertEquals(0,myList.size()); 
	}
	@Test
	
	public void test2() {
		List<Integer> myList=new List<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		assertEquals(5,myList.size());
}
@Test
	
	public void test3() {
		List<Integer> myList=new List<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.remove(2);
		myList.remove(1);
		assertEquals(3,myList.size());
}
@Test

public void test4() {
	List<Integer> myList=new List<Integer>();
	myList.add(1);
	myList.add(2);
	myList.add(3);
	myList.add(4);
	myList.add(5);
	myList.add(6);
	myList.add(7);
	myList.add(8);
	myList.add(9);
	myList.add(0);
	
	assertEquals(10,myList.size());
}
	
}
