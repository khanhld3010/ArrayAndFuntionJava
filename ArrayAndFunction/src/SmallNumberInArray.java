import java.util.Scanner;

public class SmallNumberInArray {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng số nguyên");
        int arrlength = scanner.nextInt();
        int[] arr = new int[arrlength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1)+" :");
            int element = scanner.nextInt();
            arr[i] = element;
        }
        int min = arr[0];
        for (int i : arr) {
            if (i < min){
                min = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là "+min);
    }
}
