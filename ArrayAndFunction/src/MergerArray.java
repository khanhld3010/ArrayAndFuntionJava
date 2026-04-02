public class MergerArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};        //! mảng 1 có 5 phần tử
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80}; //! mảng 2 có 8 phần tử
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }
            if (i < arr2.length) {
                arr3[arr1.length + i] = arr2[i];
            }
        }
        for (int i : arr3) {
            System.out.printf("%d\t", i);
        }
    }
}
