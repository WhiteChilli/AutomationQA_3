import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1

        int len;
        int wid;

        len = 5;
        wid = 2;

        int sqrt;
        sqrt = len * wid;

        System.out.println("Square root is: " + sqrt);

        // Task 2

        double weight;
        weight = 62.5;
        double height;
        height = 1.69;
        double BMI;
        BMI = weight / (height * height);

        System.out.println("The BMI is: " + BMI);

        // Task 3

        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);

        System.out.print("Type in an integer number:  ");
        int firstNum = firstInput.nextInt();

        System.out.print("Type in another integer:  ");
        int secondNum = secondInput.nextInt();

        System.out.println("The result of multiplication is: " + (firstNum * secondNum));

        // close Scanners
        firstInput.close();
        secondInput.close();
    }

}
