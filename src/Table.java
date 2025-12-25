import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter your number :");
        number=sc.nextInt();
        int result;
        for(int count =1; count <= 10; count++) {
            result = count * number;
            System.out.println(number + " X " + count + " = " + result);
        }
    }
}