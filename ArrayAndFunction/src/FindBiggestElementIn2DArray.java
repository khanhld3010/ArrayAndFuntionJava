import java.util.Scanner;

public class FindBiggestElementIn2DArray {
    static void main(String[] args) {
//        int [][] matrix ={
//                {1, 2, 3, 4},
//                {5, 66, 7, 8},
//                {9, 10, 11, 12}
//        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng của ma trận");
        int row = scanner.nextInt();
        System.out.println("Nhập số lượng cột của ma trận");
        int column = scanner.nextInt();
        int[][] matrix1 = new int[row][column];
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println("Nhập giá trị của hàng thứ "+(i+1)+" :");
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Nhập giá trị của cột thứ "+(j+1)+" :");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int max = finBiggestNumberInMatrix(matrix1);
        System.out.printf("Giá trị lớn nhất trong mảng 2 chiều là %d",max);
    }

    static int finBiggestNumberInMatrix(int[][] matrix){
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
