public class NestedForLoop
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                // System.out.println("  " + i);
                // System.out.print(" " + i);
                // System.out.println(" " + j);
                // System.out.print(" " + j);
                //System.out.print(" " + i+j);
                System.out.print(" " + (i + j));
            }
            System.out.println(" ");
        }
    }
}