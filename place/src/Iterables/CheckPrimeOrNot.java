package Iterables;
import java.util.Scanner;

public class CheckPrimeOrNot {
    public static boolean isPrime(int n){
        
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }   
        }

        return true;

    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=isPrime(n);
        if(result){
            System.out.println(n+" is a prime number");
        }
      //  else{
           // System.out.println(n+" is not a prime number");
       // }
      else{

        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }}
        }
        System.out.println();
    }
}