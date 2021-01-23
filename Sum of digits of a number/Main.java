import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner in  = new Scanner(System.in);
	 int n = in.nextInt();
      int sum=0;
      while(n > 0)
		{ 
           // Extract last digit
		   int rem = n % 10;
           // Adding each digit with sum 
		   sum = sum + rem;
           // Removing last digit
		   n = n / 10;
		}
		System.out.print(sum);

	}
}