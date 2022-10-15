import java.util.Scanner;

public class Exp_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum;
        int secondNum;

        System.out.println("Enter two numbers : ");
        firstNum = sc.nextInt();
        secondNum  = sc.nextInt();
        int result = firstNum + secondNum;
        System.out.println("Addition of given nums is "+ result);
    }
}
