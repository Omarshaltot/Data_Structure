package Data_Structure;

public class Insertion_Sort {

    public static void insertionnn(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}