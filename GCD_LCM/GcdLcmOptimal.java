import java.util.*;

public class GcdLcmOptimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rem = 1;

        // copying the variables as we have to find lcm later in long as lcm could be big and need product of num1 and num2 which could be max of order 10^18 as per the constraints
        long n1 = num1;
        long n2 = num2;

        while(rem != 0) {

            // int quo = num1/num2;     -> this works perfectly fine but occupies unnecessary memory

            // as we don't need the quotient we might not even calculate it - just below code is alright
            rem = num1%num2;

            num1 = num2;
            num2 = rem;
        }

        System.out.println(num1);
        System.out.print((n1*n2) / num1);

        sc.close();
    }
}