import java.util.Scanner;

public class SumColumnInMatrix {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cột muốn tính tổng");
        int column = scanner.nextInt();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 66, 7, 8},
                {9, 10, 11, 12}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        System.out.println(sum);
    }
}
