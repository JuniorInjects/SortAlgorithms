//       __              _          _____        _           _       
//       \ \ _   _ _ __ (_) ___  _ _\_   \_ __  (_) ___  ___| |_ ___ 
//        \ \ | | | '_ \| |/ _ \| '__/ /\/ '_ \ | |/ _ \/ __| __/ __|
//     /\_/ / |_| | | | | | (_) | /\/ /_ | | | || |  __/ (__| |_\__ \
//     \___/ \__,_|_| |_|_|\___/|_\____/ |_| |_|/ |\___|\___|\__|___/
//                                            |__/  Selection Sort

public class SelectionSort {

	private int arr[];
	private int length;

	public SelectionSort(int arr[]) {
		this.arr = arr;
		this.length = arr.length;
	}

	public void sort() {
		for(int i = 0; i < length; i++) {
			int min_index = i;
			for(int j = i+1; j < length; j++) {
				if(arr[min_index] > arr[j])
					min_index = j;
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

	public String get() {
		String result = "";
		for(int i = 0; i < length; i++)
			result = result + " " + arr[i];
		return result;
	}
}
