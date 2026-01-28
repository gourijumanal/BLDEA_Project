package Iterables;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String args[]){
        int n,sum=0;

        //TC: O(n) SC: O(1)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        } 
        System.out.println("Sum of first "+n+" numbers is: "+sum);  
    }
    
}
