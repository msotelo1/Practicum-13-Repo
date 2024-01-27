// Practicum 13 (while and for loops) Solution

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // var declarations
        int n, sum1, sum2;
     
        Scanner input = new Scanner(System.in);

        // prompt user for value of n to sum up to
        // if then enter 5, should add up 1 to 5 (equal to 15)
       System.out.print("Enter number: ");
       n = input.nextInt();

        // use a for loop to sum up the values and assign to sum1
        sum1 = 0;
        for(int i = 1; i <= n; i++)
          sum1 = sum1 + i;

        // use a while loop to sum up the values and assign to sum2
        sum2 = 0;
        int i = 1;
        while(i <= n){
          sum2 = sum2 + i;
          i = i + 1;
        }

        // display results
        System.out.println(
          "Sum of 1.." + n + " by use of for loop is " + sum1);

        System.out.println(
          "Sum of 1.." + n + " by use of while loop is " + sum2);
    }
}
