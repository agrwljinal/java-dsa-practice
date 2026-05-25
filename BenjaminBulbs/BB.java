import java.util.*;

public class BB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            // for (int j = 1; j<=i; j++) {

            //     if (j*j==i) {
            //         System.out.println(i);
            //     }
            // }

            if (Math.pow(i,0.5) == (int) Math.pow(i,0.5)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}