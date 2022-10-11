import java.util.Scanner;

public class calculator {

    Scanner console = new Scanner (System.in);
    double num1 = 0;
    double num2 = 0;
    double answer = 0;
    String operation = "";

    public void start() {
        System.out.println("Enter number: ");
        num1 = console.nextDouble();
        menu();
    }

    public void menu() {
        System.out.println("Enter operation:  +  -  /  *  ^  sqrt  =");
        operation = console.next();

        if (operation.equals("=")) {
            enter();
        } else if(operation.equals("sqrt")) {
            sqrt();
        } else {
            System.out.println("Enter number: ");
            num2 = console.nextDouble();
            calculate();
        }
    }
    
    public void calculate() {
        switch (operation){
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
            case "/":
                divide();
                break;
            case "^":
                power();
                break;
            case "sqrt":
                sqrt();
                break;
            case "=":
                enter();
                break;
            default:
                System.out.println("Select valid operation.");
        }
    }
    
    public void add() {
        answer = num1 + num2;
        num1 = answer;
        menu();
    }
    
    public void subtract() {
        answer = num1 - num2;
        num1 = answer;
        menu();
    }
    
    public void multiply() {
        answer = num1*num2;
        num1 = answer;
        menu();
    }
    
    public void divide() {
        answer = num1 / num2;
        num1 = answer;
        menu();
    }

    public void power() {
        answer = Math.pow(num1, num2);
        num1 = answer;
        menu();
    }

    public void sqrt() {
        answer = Math.sqrt(num1);
        num1 = answer;
        System.out.println(answer);
        menu();
    }
    
    public void enter() {
        System.out.println("Answer is " + answer);
    }

}