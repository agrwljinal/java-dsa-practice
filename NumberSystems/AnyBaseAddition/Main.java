import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int b =  sc.nextInt();
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int sum=0;
      int power=1;
      
      while (n1!=0 || n2!=0) {
        
        int rem1 = n1 % 10;
        int rem2 = n2 % 10;
        
        n1 /= 10;
        n2 /= 10;
        
        if (rem1+rem2<b) {
          sum += (rem1+rem2) * power;
        }
        
        else {
          sum += ((rem1+rem2)%b) * power;
          n1 += (rem1+rem2)/b;
        }
        
        power *= 10;
      }
      
      System.out.print(sum);

      sc.close();
    }
}