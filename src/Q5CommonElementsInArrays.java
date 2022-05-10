import java.util.Arrays;

public class Q5CommonElementsInArrays {
    public static void main(String[] args) {
        int arr1[] = new int[] {2,7,17,3 ,4,3};
        int arr2[] = new int[] {2,5,7,6,4};

        System.out.println("1st Array : "+ Arrays.toString(arr1));
        System.out.println("2nd Array : "+ Arrays.toString(arr2));

        for (int i = 0; i < arr1.length ; i++)
        {
            for (int j = 0; j < arr2.length ; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println("Common elements in array : "+arr1[i]);
                }
            }

        }
    }
}
