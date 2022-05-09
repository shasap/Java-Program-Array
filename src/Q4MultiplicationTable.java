import java.util.Scanner;

public class Q4MultiplicationTable {
    public static void main(String[] args) {

        int i = 1;
        Scanner num = new Scanner(System.in);
        System.out.println("Multiplication table of 1, 2 & 3 up to");
        int n = num.nextInt();

        // do...while loop from 1 to 5
        do {
            System.out.print(i*1);
            System.out.print("     "+i*2);
            System.out.print("     "+i*3);
            System.out.println();
            i++;
        } while(i <= n);
    }
}
