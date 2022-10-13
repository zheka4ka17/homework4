public class exercise1 {
    /*Fibonacci numbers are a sequence of numbers, in which the first
two numbers of the sequence are 0 and 1, and each successive
number is equal to the sum of two preceding ones.
Output all Fibonacci numbers in the range from 0 to 10,000,000
to the screen.*/
    public static void main(String[] args) {
        int a=0; int b=1;
        int digit = 0;
        System.out.println(a);
        System.out.println(b);
      while (digit<10000000){
          digit = a+ b;
          a=b; b=digit;
          System.out.println(digit);
        }
    }
}
