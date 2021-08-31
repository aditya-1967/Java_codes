import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        System.out.println("Calculator\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number an operator(+, -, *, /), and a number: ");
        int a = in.nextInt();
        char op = in.next().charAt(0);
        int b = in.nextInt();
        
        switch (op) {
            case '+':
                System.out.println((double)(a+b));
                break;
            case '-':
                System.out.println((double)(a-b));
                break;
            case '*':
                System.out.println((double)(a*b));
                break;
            case '/':
                System.out.println((double)(a/b));
                break;
            default:
                System.out.println("Enter Valid Input");
                break;
        }

        in.close();

    }
}
