import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int div = 2; div*div<=n; div++) {

            while (n%div==0) {
                System.out.println(div);
                n = n/div;
            }
        }

        // if there is something greater than 1 left as div then that entire will be a prime factor of input number because there was no sub factor found till its root.
        if(n!=1) {
            System.out.print(n);
        }

        sc.close();
    }
}
