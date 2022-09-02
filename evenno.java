import java.util.Scanner;
public class evenno {
    public static void main(String [] args) {
        double i;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a Number");
        i = s1.nextDouble();

        if (i%2 == 0) {
            System.out.println("You entered an Even number");
        }
        else{
            System.out.println("You entered an Odd number");
        }
    }
}
