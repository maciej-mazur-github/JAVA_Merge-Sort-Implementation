import com.sort.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 1, 4, 3, 8, 7, 8, 2};
        MergeSort.printArray(array);
        MergeSort.sort(array);
        MergeSort.printArray(array);
    }
}
