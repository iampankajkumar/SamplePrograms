import java.util.HashSet;
import java.util.Set;

class FindIntexOfleftRightSum {
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[] { 2, 2, 3, 1, 2, 1, 7, 3,5 }));
    }

    private static int removeDuplicate(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int leftSum = arr[0];
        int rightSum = arr[j];

        while (i <= j) {
            if (leftSum > rightSum)
                rightSum += arr[--j];
            else if (leftSum < rightSum)
                leftSum += arr[++i];

            if (leftSum == rightSum) {
                if (++i == --j)
                    return i;
                else {
                    leftSum += arr[i];
                    rightSum += arr[j];
                }
            }

        }
        return -1;
    }
}