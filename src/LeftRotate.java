import java.util.Arrays;

class LeftRotate {
    // Method to left rotate the array by 1 position
    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;
    }

    public static void leftRotate(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr);  // Rotate by one position d times
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;  // Number of positions to rotate left

        System.out.println("Original Array: " + Arrays.toString(arr));

        leftRotate(arr, d);

        System.out.println("Array after " + d + " left rotations: " + Arrays.toString(arr));
    }
}


