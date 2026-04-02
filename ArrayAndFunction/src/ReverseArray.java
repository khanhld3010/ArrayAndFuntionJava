import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array:", "");
        for (int i : array) {
            System.out.print(i + "\t");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[array.length -1-i];
            array[array.length-1-i] = array[i];
            array[i] = tmp;
        }
        System.out.printf("%-20s%s", "Reverse array:", "");
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
