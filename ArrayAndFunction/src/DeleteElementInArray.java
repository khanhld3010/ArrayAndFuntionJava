import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số mà bạn muốn xóa");
        int element = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Không tìm thấy phần tử cần xóa");
        }else {
            for (int i = index; i < arr.length-1 ; i++) {
                arr[i] = arr[i+1];
                arr[arr.length-1] = 0;
            }
            for (int i : arr) {
                System.out.printf("%d\t",i);
            }
        }

    }
}
