//       __              _          _____        _           _       
//       \ \ _   _ _ __ (_) ___  _ _\_   \_ __  (_) ___  ___| |_ ___ 
//        \ \ | | | '_ \| |/ _ \| '__/ /\/ '_ \ | |/ _ \/ __| __/ __|
//     /\_/ / |_| | | | | | (_) | /\/ /_ | | | || |  __/ (__| |_\__ \
//     \___/ \__,_|_| |_|_|\___/|_\____/ |_| |_|/ |\___|\___|\__|___/
//                                            |__/  Quick Sort

public class QuickSort {

    private int arr[];
    private int length;

    public QuickSort(int arr[]) {
        this.arr = arr;
        this.length = arr.length;
    }

    public void sort() {
        sort(0, length - 1);
    }

    private void sort(int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            sort(low, i);
            sort(i + 2, high);
        }
    }

    public String get() {
        String result = "";
        for (int i = 0; i < length; i++)
            result = result + " " + arr[i];
        return result;
    }
}
