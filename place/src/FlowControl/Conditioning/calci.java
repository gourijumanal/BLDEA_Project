package FlowControl.Conditioning;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------menu-------");
        System.out.println("1 as addition");
        System.out.println("2 as subtraction");
        System.out.println("3 as multiplication");
        System.out.println("4 as division");

        System.out.println("Enter the numbers");
        double a =sc.nextInt();
        double b =sc.nextInt();

        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        double result=0;

        switch(choice){
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        System.out.println("Result: " + result);
        }
    }

