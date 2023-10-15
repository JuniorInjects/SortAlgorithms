//       __              _          _____        _           _       
//       \ \ _   _ _ __ (_) ___  _ _\_   \_ __  (_) ___  ___| |_ ___ 
//        \ \ | | | '_ \| |/ _ \| '__/ /\/ '_ \ | |/ _ \/ __| __/ __|
//     /\_/ / |_| | | | | | (_) | /\/ /_ | | | || |  __/ (__| |_\__ \
//     \___/ \__,_|_| |_|_|\___/|_\____/ |_| |_|/ |\___|\___|\__|___/
//                                            |__/  Bubble Sort

public class BubbleSort {

	private int arr[];
	private int length;

	public BubbleSort(int arr[]) {
		this.arr = arr;
		this.length = arr.length;
	}

	public void sort() {
		for(int i = 0; i < length; i++) {
			for(int j = 1; j < length-i; j++) {
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public String get() {
		String result = "";
		for(int i = 0; i < length; i++)
			result = result + " " + arr[i];
		return result;
	}
}
