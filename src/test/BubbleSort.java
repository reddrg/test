package test;

public class BubbleSort {

	private static final int[] ARR = {9, 6, 1, 3, 5, 2, 8, 7, 4};
	
	public static int[] bubbleSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				int temp = 0;
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] result = bubbleSort(ARR);
		for(int temp : result)
			System.out.print(temp + " ");
	}

}
