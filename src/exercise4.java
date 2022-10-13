public class exercise4 {
    /*A perfect number is a natural number that is equal to the sum
of all its own divisors (that is, all positive divisors different from
the number itself).
Display all the perfect numbers in the range from 0 to 1,000,000.
Examples:
The 1st perfect number, 6, has the following own divisors: 1, 2,
3; their sum is 6.
The 2nd perfect number, 28, has the following own divisors: 1,
2, 4, 7, 14; their sum is 28.*/
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) System.out.println(i);

        }

    }}