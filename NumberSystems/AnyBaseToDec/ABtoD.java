import java.util.*;

public class ABtoD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();

        int power = 0;
        int newNum = 0;

        while (n!=0) {

            int rem = n%10;
            n /= 10;
            newNum += rem * (int) Math.pow(b,power);
            power++;
        }

        System.out.print(newNum);

        sc.close();
    }
}