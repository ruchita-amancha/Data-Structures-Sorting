public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
