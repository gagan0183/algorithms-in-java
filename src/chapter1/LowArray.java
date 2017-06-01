package chapter1;

public class LowArray {
	private long arr[];
	
	public LowArray(int size) {
		arr = new long[size];
	}
	
	public void setElement(int index, long value) {
		arr[index] = value;
	}
	
	public long getElement(int index) {
		return arr[index];
	}
}
