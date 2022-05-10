public class Q8TransposeMatrix {
    public static void main(String[] args) {
        int raw = 4;
        int column = 2;
        int matrix[][] = {{1,2},{3,4},{5,6},{7,8}};

        System.out.println("Original matrix : ");

        for (int i = 0; i < raw; i++)
        {
            for (int j = 0; j < column ; j++)
            {
                System.out.print(matrix [i][j]+" ");
            }
            System.out.println();
        }

        int transpose [][] = new int[column][raw];

        for (int i = 0; i <column ; i++)
        {
            for (int j = 0; j <raw ; j++)
            {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose matrix : ");
        for (int i = 0; i < column ; i++)
        {
            for (int j = 0; j < raw ; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
