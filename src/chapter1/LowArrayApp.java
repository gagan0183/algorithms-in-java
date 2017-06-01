package chapter1;

public class LowArrayApp {

	public static void main(String[] args) {
		LowArray lowArray = new LowArray(100);
		
		int elements = 10;
		lowArray.setElement(0, 1);
		lowArray.setElement(1, 2);
		lowArray.setElement(2, 3);
		lowArray.setElement(3, 4);
		lowArray.setElement(4, 5);
		lowArray.setElement(5, 6);
		lowArray.setElement(6, 7);
		lowArray.setElement(7, 8);
		lowArray.setElement(8, 9);
		lowArray.setElement(9, 10);
		
		int p = 0;
		
		for(p = 0; p < elements; p++) {
			System.out.println(lowArray.getElement(p));
		}
		
		long search = 9;
		for(p = 0; p < elements; p++) {
			if(lowArray.getElement(p) == search) {
				break;
			}
		}
		
		if(p == elements) {
			System.out.println("Element is not there");
		}
		else {
			System.out.println("Element is : " +  lowArray.getElement(p));
		}
		
		long delete = 5;
		
		for(p = 0; p < elements; p++) {
			if(lowArray.getElement(p) == delete) {
				break;
			}
		}
		
		for(int e = p; e < elements; e++) {
			lowArray.setElement(e, lowArray.getElement(e + 1));
		}
		
		elements--;
		
		for(p = 0; p < elements; p++) {
			System.out.println(lowArray.getElement(p));
		}
	}
}
