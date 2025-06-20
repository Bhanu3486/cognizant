import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        arr[2] = 99;
        System.out.println("Array: " + Arrays.toString(arr));
    }
}