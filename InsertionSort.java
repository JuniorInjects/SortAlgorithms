//       __              _          _____        _           _       
//       \ \ _   _ _ __ (_) ___  _ _\_   \_ __  (_) ___  ___| |_ ___ 
//        \ \ | | | '_ \| |/ _ \| '__/ /\/ '_ \ | |/ _ \/ __| __/ __|
//     /\_/ / |_| | | | | | (_) | /\/ /_ | | | || |  __/ (__| |_\__ \
//     \___/ \__,_|_| |_|_|\___/|_\____/ |_| |_|/ |\___|\___|\__|___/
//                                            |__/  Insertion Sort                 

public class InsertionSort {

	private int arr[];
	private int length;

	public InsertionSort(int arr[]) {
		this.arr = arr;
		this.length = arr.length;
	}

	public void sort() {
		for(int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public String get() {
		String result = "";
		for(int i = 0; i < length; i++)
			result = result + " " + arr[i];
		return result;
	}
}
