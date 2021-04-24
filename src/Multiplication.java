import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello !Which number do want to multiply?");
        int number1= scanner.nextInt();
        System.out.println("Please enter how many times you want to multiply?");
        int number2 = scanner.nextInt();
        for (int i = 0; i <= number2; i++) {

            int multiplying = number1 * i ;
            String answer1 = number1+" * "+i+" = "+multiplying;
            System.out.println(answer1); }

    }


}
