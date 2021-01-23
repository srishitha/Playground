import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Type your code here    
    Scanner in= new Scanner(System.in);
    int n1= in.nextInt();
    int first_dig = n1 / 100;
    int second_dig = (n1/10)%10;
    int third_dig = n1%10;
    int reverse =((third_dig*100)+(second_dig*10)+first_dig);
    System.out.println(reverse);
  }
}