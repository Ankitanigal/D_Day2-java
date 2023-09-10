//Day2.1:WAP to find factorial of given number.
public class Fact {
  public static void main(String[] args) {

        int num = 4;
        long fact = 1;
        for(int i = 1; i <= num; ++i)
        {
             fact = fact* i;
          
        }
        System.out.printf("Factorial of %d = %d", num, fact);
    }
}