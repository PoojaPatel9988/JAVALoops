/*
print number for 1 to N.
 */
import java.util.Scanner;

public class SequenceNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int num1=1;
        System.out.print("enter any ending number :");
        int num2=sc.nextInt();


        while(num1 <= num2)
        {
            System.out.println(num1);
            num1++;
        }

    }
}
