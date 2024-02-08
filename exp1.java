import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>(N);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; ++i) {
            A.add(scanner.nextInt());
        }
        Collections.reverse(A);
        System.out.println("Reversed array:");
        for (int element : A) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}

