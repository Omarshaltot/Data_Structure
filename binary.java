package Data_Structure;

public class binary {
    public static int binaryy_ah(int arr[], int goal) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            int val = arr[mid];

            if (val == goal) {
                return mid;
            } else if (val < goal) {
                l = mid + 1;
            } else if (val > goal) {
                r = mid - 1;
            }
        }
        return -1; // there is no number equal.
    }

}

public static void main(string []args){
    int arr[]={1,2,3,4,5,6,7,8,9,12};
    System.out.println(binaryy_ah(arr,5));
}
