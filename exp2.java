import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exp2 {
    public static ArrayList<Integer> leftRotate(ArrayList<Integer> arr, int d) {
        ArrayList<Integer> result = new ArrayList<>(arr);
        Collections.rotate(result, -d);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; ++i) {
            arr.add(scanner.nextInt());
        }
        System.out.print("Enter the number of left rotations: ");
        int d = scanner.nextInt();
        ArrayList<Integer> rotatedArray = leftRotate(arr, d);
        System.out.println("Array after " + d + " left rotations:");
        for (int element : rotatedArray) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}

