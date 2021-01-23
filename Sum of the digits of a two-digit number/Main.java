import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); 
      int a,b;
      a = n/10;
      b = n%10;
      n = a+b;
      System.out.println(n);
	}
}