import java.util.*;

public class GcdLcmBrute {
    
    public static int gcd(int n1, int n2) {

        int i;

        for (i = n1; i>=1; i--) {

            if (n1%i==0) {

                if (n2%i==0) {
                    break;
                }
            }
        }

        return i;
    }

    public static int lcm(int n1, int n2) {

        int i;

        for (i = 1; i <= n2; i++) {

            if ((n1*i) % n2 == 0) {
                break;
            }
        }

        return n1*i;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int GCD;
        int LCM;

        if (num1 == num2) {
            System.out.print(num1+"\n"+num1);
        }

        else if (num1<num2) {

            GCD = gcd(num1, num2);
            LCM = lcm(num2, num1);

            System.out.println(GCD);
            System.out.print(LCM);
        }

        else {

            GCD = gcd(num2, num1);
            LCM = lcm(num1, num2);

            System.out.println(GCD);
            System.out.print(LCM);
        }

        sc.close();

    }
}