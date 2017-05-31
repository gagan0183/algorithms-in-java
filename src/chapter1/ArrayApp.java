package chapter1;

public class ArrayApp {

	public static void main(String[] args) {
		long arr[] = new long[100];
		int elements = 10;
		int i;
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		
		for(i = 0; i < elements; i++) {
			System.out.println(arr[i]);
		}
		
		long search = 9;
		for(i = 0; i < elements; i++) {
			if(arr[i] == search) {
				break;
			}
		}
		if(i == elements) {
			System.out.println("Element not there");
		}
		else {
			System.out.println("Element found : " + arr[i]);
		}
		
		long delete = 5;
		for(i = 0; i < elements; i++) {
			if(arr[i] == delete) {
				break;
			}
		}
		for(int p = i; p < elements; p++) {
			arr[p] = arr[p + 1];
		}
		elements--;
		
		for(i = 0; i < elements; i++) {
			System.out.println(arr[i]);
		}
	}
}
