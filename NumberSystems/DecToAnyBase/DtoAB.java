import java.util.*;

public class DtoAB {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int b = sc.nextInt();
    int newNum = 0;
    int power = 0;
    
    while (n!=0) {
      
      int rem = n%b;
      n = n/b;
      
      newNum += rem * (int) Math.pow(10,power);
      power++;
    }
    
    System.out.print(newNum);

    sc.close();
  }
}