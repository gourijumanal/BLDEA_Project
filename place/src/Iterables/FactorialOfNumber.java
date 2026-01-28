package Iterables;
import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        
        System.out.println("Enter a number");

        int n=sc.nextInt();
        
        //TC: O(n) SC: O(1)
       /*  for(int i=1;i<=n;i++){ //Approch 1
            fact=fact*i;
        }*/

        //TC: O(n) SC: O(1)
        int sum = n * (n + 1) / 2;//using brute force Formula to get tc as O(1)

        int result=1;
        for(int i=1;i<=n;i++){ //Approch 2
            result=result*i;
        }
        System.out.println("Factorial of "+n+" is: "+result);

    }
}

