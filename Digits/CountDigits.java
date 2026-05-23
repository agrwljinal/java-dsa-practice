import java.util.*;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDig;

        for (numOfDig = 1; ; numOfDig++) {
            n/=10;

            if(n==0) {
                break;
            }
        }

        System.out.print(numOfDig);

        sc.close();
    }
}