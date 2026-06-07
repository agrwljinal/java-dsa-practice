import java.util.*;

public class Index {

    public static int index(int n, int[] a, int d) {

        for (int i = 0; i < n; i++) {

            if (a[i]==d) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        System.out.print(index(n,a,d));

        sc.close();
    }
}