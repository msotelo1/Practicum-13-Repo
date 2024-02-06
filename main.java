import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, sum1 = 0, sum2 = 0;
     
        Scanner input = new Scanner(System.in);

        // prompt user for value of n to sum up to
        // if then enter 5, should add up 1 to 5 (equal to 15)
        System.out.println("Enter in number wanted to sum up to");

        n = input.nextInt();

        for(int i = n; i > 0; i--)
            {
                sum1 = sum1 + i ;
            }

            int j = n;

        while(j != 0)
            {
                sum2 = sum2 + j;
                j--;
            }

        System.out.println(
          "Sum of 1.." + n + " by use of for loop is " + sum1);

        System.out.println(
          "Sum of 1.." + n + " by use of while loop is " + sum2);
    }
}
