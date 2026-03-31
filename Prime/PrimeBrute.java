import java.util.*;

public class PrimeBrute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of entries: ");
        int t = sc.nextInt();

        int flag = 0;

        System.out.print("Enter the numbers: ");

        for(int i=1; i<=t; i++) {
            
            int n = sc.nextInt();

            if (n==2 || n==3) {
                System.out.println("Prime");
            }

            else {
                for (int j=2; j<=n/2; j++) {
                    if(n%j==0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    System.out.println("Prime");
                }

                else {
                    System.out.println("Not Prime");
                }

                flag = 0;
            }
        }

        System.out.println("Program terminated successfully");
    }
}