import java.util.Scanner;
class reverse {
   public static void main(String[] args) {

      Scanner s1 = new Scanner(System.in);
      int num, reversed = 0;
      
      System.out.println("Enter a number");
      num = s1.nextInt();

  
      // run loop until num becomes 0
      while(num != 0) {
      
        // get last digit from num
        int digit = num % 10;
        reversed = reversed * 10 + digit;
  
        // remove the last digit from num
        num /= 10;
      }
  
      System.out.println("Reversed Number: " + reversed);
    }
  }