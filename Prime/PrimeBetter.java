import java.util.*;

public class PrimeBetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i<=t; i++) {        // loop-1
            int n = sc.nextInt();
            
            int count = 0;

            for (int j = 2; j*j<=n; j++) {        // loop-2
                if (n%j==0) {
                    count++;
                }
            }

            if (count==0) {
                System.out.println("prime");
            }

            else {
                System.out.println("not prime");
            }
        }

        sc.close();
    }
}