import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator!!");
        System.out.println("For Addition: press 1");
        System.out.println("For Subtraction: press 2");
        System.out.println("For Multiplication: press 3");
        System.out.println("For Division: press 4");
        int choice;
        do{
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (!(choice == 1 || choice == 2 || choice == 3 || choice == 4)) {
                System.out.println("Invalid choice!!");
            }
        }while(!(choice==1||choice==2||choice==3||choice==4));
        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();
        switch (choice){
            case 1: {
                System.out.printf("Result: %.2f",addition(num1,num2));
            }
            break;
            case 2:{
                System.out.printf("Result: %.2f",subtraction(num1,num2));
            }
            break;
            case 3:{
                System.out.printf("Result: %.2f",multiplication(num1,num2));
            }
            break;
            case 4:{
                System.out.printf("Result: %.2f",division(num1,num2));
            }
            break;
        }
        System.out.println();
        System.out.println("Calculation completed!!");
    }
    public static double addition(double num1,double num2){
        return num1+num2;
    }
    public static double subtraction(double num1,double num2){
        return num1-num2;
    }
    public static double multiplication(double num1,double num2){
        return num1*num2;
    }
    public static double division(double num1,double num2){
        return num1/num2;
    }
}
