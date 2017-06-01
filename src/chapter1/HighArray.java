package chapter1;

public class HighArray {
	private long[] arr;
	private int elements;
	
	public HighArray(int number) {
		arr = new long[number];
		elements = 0;
	}
	
	public void insert(long value) {
		arr[elements] = value;
		elements++;
	}
	
	public boolean search(long value) {
		int i = 0;
		for(i = 0 ; i < elements; i++) {
			if(arr[i] == value) {
				break;
			}
		}
		if(i == elements) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean delete(long value) {
		int i = 0;
		for(i = 0; i < elements; i++) {
			if(arr[i] == value) {
				break;
			}
		}
		
		if(i == elements) {
			return false;
		}
		else {
			for(int p = i; p < elements; p++) {
				arr[p] = arr[p + 1];
			}
			elements--;
			return true;
		}
	}
	
	public void display() {
		for(int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
