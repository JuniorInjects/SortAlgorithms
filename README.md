# Sort Algorithms

### List
- [x] [Bubble Sort](https://github.com/JuniorInjects/SortAlgorithms/blob/main/BubbleSort.java)
- [x] [Insertion Sort](https://github.com/JuniorInjects/SortAlgorithms/blob/main/InsertionSort.java)
- [x] [Selection Sort](https://github.com/JuniorInjects/SortAlgorithms/blob/main/SelectionSort.java)
- [ ] Quick Sort
- [ ] Merge Sort
- [ ] Bucket Sort
- [ ] Shell Sort
- [ ] Radix Sort
- [ ] Comb Sort

### Usage of the Sort Algorithms
```java
public static void main(String[] args) {
	int arr[] = {5,3,8,2,1}; // This is the list of numbers to be sorted.
	ExampleSort sort = new ExampleSort(arr); // Here you give the algorithm the list.
	sort.sort(); // Here you sort the list.
	System.out.println(sort.get()); // Here you output the sorted list in the console.
}
```

### Example with Bubble Sort
As an Example i will use [`Bubble Sort`](https://github.com/JuniorInjects/SortAlgorithms/blob/main/BubbleSort.java) Algorithm.
```java
public static void main(String[] args) {
	int arr[] = {5,3,8,2,1};
	BubbleSort sort = new BubbleSort(arr);
	sort.sort();
	System.out.println(sort.get());
}
```
The output in the console is: 1 2 3 5 8.
