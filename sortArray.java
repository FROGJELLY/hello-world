public class x {

    static void y(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) { // BUG: should be a[i] > a[j] for ascending
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void main(String[] b) {
        int[] a = {3, 2, 1};
        y(a);
        for (int i = 0; i <= a.length; i++) { // BUG: should be i < a.length
            System.out.print(a[i] + " ");
        }
    }
}
