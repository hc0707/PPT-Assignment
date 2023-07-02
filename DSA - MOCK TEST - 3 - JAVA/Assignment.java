1)import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

2)import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Fibonacci Series up to " + number + ":");
        
       int num1 = 0;
        int num2 = 1;
        
        System.out.print(num1 + " " + num2 + " ");
        
        for (int i = 2; ; i++) {
            int sum = num1 + num2;
            
            if (sum > number) {
                break;
            }
            
            System.out.print(sum + " ");
            
            num1 = num2;
            num2 = sum;
        }
    }

3)import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();
        
        int sum = 0;
        int number;
        int i = 0;
        
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            sum += number;
            i++;
        } while (i < count);
        
        double average = (double) sum / count;
        
        System.out.println("The average of the numbers is: " + average);
    }
}
4)import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        int largest;
        
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        
        System.out.println("The largest number is: " + largest);
    }
}
5)public class VariableDeclaration {
    public static void main(String[] args) {
        int age = 25;
        double height = 1.75;
        String name = "nitin";
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
    }
}
