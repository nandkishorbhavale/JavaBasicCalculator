import java.util.Scanner;

class calculator {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        return num1 / num2;
    }

    public int mod(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        calculator c = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Operation You want to perform?");
        boolean flag = true;
        while (flag) {
            System.out.println("1. Sum\n2. Substraction\n3. Multiplication\n4. Division \n5. Find Modulus\n");
            System.out.println("Please, Enter your choice: ");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter the first number: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Sum of the two number: " + c.sum(num1, num2));
                    System.out.println("*****************Your operation is Performed!******************");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    int subNumber1 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int subNumber2 = sc.nextInt();
                    System.out.println("Substraction of the two number: " + c.sub(subNumber1, subNumber2));
                    System.out.println("*****************Your operation is Performed!******************");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    int multiNumber1 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int multiNumber2 = sc.nextInt();
                    System.out.println("Multiplication  of the two number: " + c.multi(multiNumber1, multiNumber2));
                    System.out.println("*****************Your operation is Performed!******************");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter the first number: ");
                    double divNumber1 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    double divNumber2 = sc.nextInt();
                    System.out.println("Division of the two number: " + c.div(divNumber1, divNumber2));
                    System.out.println("*****************Your operation is Performed!******************");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the first number: ");
                    int modNumber1 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int modNumber2 = sc.nextInt();
                    System.out.println("Modulus of " + modNumber1 + " is: " + c.mod(modNumber1, modNumber2));
                    System.out.println("*****************Your operation is Performed!******************");
                    System.out.println();
                    break;
                default:
                    System.out.println("Please enter correct opration number!");
                    System.out.println();
            }
        }

        sc.close();
    }
}