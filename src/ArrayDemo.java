import java.util.Arrays;

public class ArrayDemo {

        // Method to show pass-by-reference behavior
        static void modifyArray(int[] arr) {
            arr[0] = 999;
        }

        public static void main(String[] args) {

            int[] a = {10, 20, 30};
            int[] b = new int[3];   // default values = 0

            b[0] = 5;
            b[1] = 15;
            b[2] = 25;

            System.out.println("a[1]: " + a[1]); // 20

            System.out.println("Length of a: " + a.length);

            System.out.print("Array a: ");

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            System.out.print("Array b: ");
            for (int value : b) {
                System.out.print(value + " ");
            }
            System.out.println();



        /* ============================
           7. Reference Assignment
           ============================ */
            int[] ref = a;
            ref[0] = 100;
            System.out.println("a[0] after ref change: " + a[0]); // 100

        /* ============================
           8. Passing Arrays to Methods
           ============================ */
            modifyArray(a);
            System.out.println("a[0] after method call: " + a[0]); // 999

        /* ============================
           9. Copying Arrays
           ============================ */
            int[] copy = Arrays.copyOf(a, a.length);
            copy[1] = 777;

            System.out.println("Original a: " + Arrays.toString(a));
            System.out.println("Copied array: " + Arrays.toString(copy));

        /* ============================
           10. Comparing Arrays
           ============================ */
            int[] c = {999, 20, 30};
            System.out.println("a == c: " + (a == c)); // false
            System.out.println("Arrays.equals(a, c): " + Arrays.equals(a, c));

        /* ============================
           11. Sorting Arrays
           ============================ */
            int[] unsorted = {5, 2, 9, 1};
            Arrays.sort(unsorted);
            System.out.println("Sorted: " + Arrays.toString(unsorted));

        /* ============================
           12. Binary Search
           ============================ */
            int index = Arrays.binarySearch(unsorted, 5);
            System.out.println("Index of 5: " + index);

        /* ============================
           13. Multidimensional Array
           ============================ */
            int[][] matrix = {
                    {1, 2},
                    {3, 4}
            };

            System.out.println("matrix[1][0]: " + matrix[1][0]);

        /* ============================
           14. Jagged Array
           ============================ */
            int[][] jagged = new int[3][];
            jagged[0] = new int[2];
            jagged[1] = new int[4];
            jagged[2] = new int[1];

            System.out.println("Jagged lengths:");
            for (int i = 0; i < jagged.length; i++) {
                System.out.println("Row " + i + ": " + jagged[i].length);
            }

        /* ============================
           15. Common Pitfall Example
           ============================ */
            // Uncommenting the next line would cause ArrayIndexOutOfBoundsException
            // System.out.println(a[10]);

            System.out.println("Program completed successfully.");
        }

}
