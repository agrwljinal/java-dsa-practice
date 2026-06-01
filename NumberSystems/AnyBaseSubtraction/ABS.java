import java.util.*;

public class ABS {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int b = sc.nextInt();
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int rem1;
      int rem2;
      
      int diff = 0;
      int power = 1;
      int borrow = 0;
      
      while (n1!=0 || n2!=0) { 
        
        rem1 = n1 % 10;
        rem2 = n2 % 10;
        
        n1 /= 10;
        n2 /= 10;
        
        rem1 -= borrow;
        
        if (rem1 >= rem2) {
          borrow = 0;
        }
        
        else {
          rem1 += b;
          borrow = 1;
        }
        
        diff += (rem1-rem2)*power;
        power *= 10;
      }
      
      System.out.print(diff);
      sc.close();
    }
}