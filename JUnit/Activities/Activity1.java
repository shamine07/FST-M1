import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
	
	static ArrayList<String> list;
	
	@BeforeEach
	void setUp() {
		list = new ArrayList<String>();
		list.add("Alpha");
		list.add("Beta");
	
	}
	
	@Test
	public void insertTest() {
		//Assertion 1
		assertEquals(2, list.size(), "The size of the ArrayList should be 2");
		
		//Assertion 2
		list.add("Omega");
		assertEquals(3, list.size(), "The size of the ArrayList should be 3");
		
		//Assertion 3
		assertEquals("Alpha", list.get(0), "Element at index 0 does not match" );
		
	}
	
	@Test
	public void replaceTest() {
		//Assertion 1
		assertEquals(2, list.size(), "Size of the list should be 2");
		
		//Assertion 2
		list.add("Gamma");
		assertEquals(3, list.size(), "Size should be 3");
		
		//Assertion 3
		list.set(1, "test");
		assertEquals("Alpha", list.get(0), "Element at index 0 does not match");
		assertEquals("test", list.get(1), "Element at index 1 does not match");
		assertEquals("Gamma", list.get(2), "Element at index 1 does not match");
	}

}
