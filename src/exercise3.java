public class exercise3 {
    /*A prime number is a natural (positive integer) number that has
exactly two varying natural divisors, one and itself. In other
words, the number N is prime, if it is greater than 1 and is thus
divisible without remainder by only 1 and N (itself).
Write a program that displays all the prime numbers in the
range from 2 to 1,000,00. Try not to perform unnecessary actions
(for example, after you have found at least one nontrivial divisor,
it is already clear that the number is composite and you do not
need to continue the check). Also note that the smallest divisor
of a natural number n, if there is any, is located in the interval
[2; √n].*/
    public static void main(String[] args) {
        System.out.println(1);
        for (int i = 2; i<1000; i++){
            int a = (int) Math.sqrt(i);
            int b =0;
            for (int j= 2;j<=a;j++ ){
                if (i%j==0){
                    b=i;} }

             if (b==0) {
                 System.out.println(i);}





            }
        }
    }

