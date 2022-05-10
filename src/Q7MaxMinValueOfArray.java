public class Q7MaxMinValueOfArray {

    public static void main(String[] args)
    {
        int myArray [] = {2,0,-77,55,72,-20,100};

        // Assign first array element to two variable
        int max = myArray[0];
        int min = myArray[0];

        //now using for loop we can find minimum and maximum value of array

        for (int i = 1; i < myArray.length; i++)
        {
            if(max < myArray[i])
            {
                max = myArray[i];
            }else if(min > myArray[i])
            {
                min = myArray[i];
            }
        }
        System.out.println("Maximum value of array : "+max);
        System.out.println("Minimum value of array : "+min);

    }
}
