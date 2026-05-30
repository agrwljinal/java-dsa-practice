import java.util.*;

public class ABtoAB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int newNum = 0;
        int power = 1;

        while (n!=0) {
            
            int rem = n % b2;
            n /= b2;

            newNum += rem * power;
            power *= b1;
        }

        System.out.print(newNum);

        sc.close();
    }
}