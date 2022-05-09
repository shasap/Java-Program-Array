import java.util.Arrays;

public class Q2SortArrayValuesInAscendingOrder {
    public static void main(String[] args) {

        //declaration, instantiation and initialization
        int []arr = new int[]{1,5,0,-5,88,-79};

        //Statement to print out original arrays
        System.out.print("Ëlements of original array: ");

        /*Use inbuilt method Arrays.toString(); and
        printout original arrays */
        System.out.println(Arrays.toString (arr));
        System.out.println();

        //Use inbuilt method to sort array in ascending order
        Arrays.sort(arr);

         /*Use inbuilt method Arrays.toString(); and
        printout arrays in ascending order */
        System.out.println("Elements of Arrays in ascending order: ");
        System.out.println(Arrays.toString (arr));

    }
}
