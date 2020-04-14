import java.util.Scanner;
public class CompleteIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();


        if (number==10) {
            System.out.println("10 is equal to " + number);
        }
        else if (number>10) {
            System.out.println(number + "is greater than 10");
            }
        else{
            System.out.println(number+ "is less than 10");
            }



        System.out.println("Application finished.");
    }
}
