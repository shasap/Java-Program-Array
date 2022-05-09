import java.util.Arrays;

public class Q1TestEqualityOfArray {
    public static void main(String args[]){
        //declaration, instantiation and initialization
        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};

        /* Checking if above two arrays are equal
        * using equals() method*/

        if (Arrays.equals(arr1,arr2))
        {
            System.out.println("Array is same.");
        }else
        {
            System.out.println("Array is not same.");
        }
    }
}
