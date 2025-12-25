import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter your number :");
        num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println("Print reverse number : " + i);
        }
    }
}