import java.util.*;

public class PythagoreanTriplets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // finding hypotenuse as max

        int max = 1;

        // max is hypotenuse, n1 and n2 will be base and perpendicular
        if(n1>n2 && n1>n3) {
            max = n1;
            n1 = n2;
            n2 = n3;
        }

        else if (n2>n1 && n2>n3) {
            max = n2;
            n2 = n3;
        }

        else {
            max = n3;
        }

        boolean flag = max*max == n1*n1 + n2*n2;
        System.out.print(flag);

        sc.close();
    }
}