import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần chèn vào mảng");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí để chèn giá trị");
        int index = scanner.nextInt();
        if (index <= -1 || index >= arr.length) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length-1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            for (int i : arr) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
