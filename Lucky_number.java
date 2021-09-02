import java.util.Scanner;
public class Lucky_number {
    public static void main(String[] args)                //Four Digit Lucky Number
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        String x = input.next();
        input.close();
        
        if((int)(x.charAt(0)) + (int)(x.charAt(1)) == (int)(x.charAt(2)) + (int)(x.charAt(3)))
        {
            System.out.println(x + " is your lucky Number");
        }
        else
        {
            System.out.println(x + " is not a lucky number");
        }
    }
}
