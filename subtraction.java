import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter num1 = ");
        int num1 = sc.nextInt();

        System.out.println("Inter num2 = ");
        int num2 = sc.nextInt();

        int result = num1;

        for(int i = 0; i < num2; i++) {
            result--;
        }
        System.out.println("The result is " + result);
    }    
}
