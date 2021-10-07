import java.util.*;

class Number {
    private int number;

    public void setNumber(int num) {
        this.number = num;
    }

    public int getNumber() {
        return number;
    }

}


public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("######################################## Welcome to the Game #######################################");
        int lucky_number = 3;
        int choice = 1;

        
        Number number = new Number();
        while (choice == 1) {
            System.out.println("Enter your number: ");
            Scanner num = new Scanner(System.in);
            number.setNumber(num.nextInt());
            if (number.getNumber() == lucky_number) {
                System.out.println("You Win");
            }
            else {
                System.out.println("You Lose");
            }
            System.out.println("Do you want to try again: (1: yes , 0: no)");
            Scanner again = new Scanner(System.in);
            choice = again.nextInt();
            num.close();
            again.close();
        }  
    }
}
