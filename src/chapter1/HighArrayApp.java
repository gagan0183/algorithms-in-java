package chapter1;

public class HighArrayApp {

	public static void main(String[] args) {
		HighArray array = new HighArray(100);
		
		array.insert(1);
		array.insert(2);
		array.insert(3);
		array.insert(4);
		array.insert(5);
		array.insert(6);
		array.insert(7);
		array.insert(8);
		array.insert(9);
		
		array.display();
		
		if(array.search(9)) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
		
		array.delete(5);
		array.display();
	}
}
