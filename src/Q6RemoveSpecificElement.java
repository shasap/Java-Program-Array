import java.util.Arrays;

public class Q6RemoveSpecificElement {

    public static void main(String[] args)
    {

        // method 1
//        int[]original_array = {5,15,25,35,45,55,65};
//
//        int[]new_array = new int[original_array.length -1];
//        System.out.println("Original array : "+Arrays.toString(original_array));
//
//        int removeIndex = 1;
//        for (int i = removeIndex; i < original_array.length - 1; i++)
//        {
//            original_array[i] = original_array[i+1];
//        }
//        System.out.println("After removing element : "+Arrays.toString(original_array));

        // Method 2

        int[]original_array = {5,15,25,35,45,55,65};
        int[]new_array = new int[original_array.length -1];
        System.out.println("Original array: "+ Arrays.toString(original_array));

        int removeIndex = 3;

        for (int i = 0,j = 0; i < original_array.length && j < new_array.length; i++)
        {
//            int added = original_array[i];
            if(i != removeIndex)
            {
                new_array[j++] = original_array[i];
            }
//            else
//            {
//                new_array[j] = added;
//                j++;
//            }
        }
        System.out.println("After removing second element :" +Arrays.toString(new_array));
    }
}
