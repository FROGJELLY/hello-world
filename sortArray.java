public class SortArray {

    // Method to sort array in ascending order
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // swap if smaller
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1};
        sort(numbers);

        for (int i = 0; i < numbers.length; i++) { // fixed loop condition
            System.out.print(numbers[i] + " ");
        }
    }
}
