import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, originalNum, remainder;
        int result = 0;

        num = sc.nextInt();
        originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
