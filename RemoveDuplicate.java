public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int a[] = removeDuplicate(new int[] { 1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10 }, 14);
        for (int ar : a) {
            System.out.print(ar + " ");
        }
    }

    private static int[] removeDuplicate(int[] arr, int size) {
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1] = -1;
            }
        }
        return arr;
    }
}