public class exercise2 {
    /*Write a program that displays numbers from 1 to 1000. In this
case, instead of numbers that are multiples of three, the program
should output the word fizz, and instead of numbers that are
multiples of five, the word buzz should be outputted. If the
number is a multiple of fifteen, then the program should output
the word hiss instead of the number.*/
    public static void main(String[] args) {

        for (int i =1 ; i<=1000; i++){
            if (i%3==0){
                if (i%15==0) {
                    System.out.println("hiss");}
                    else System.out.println("fizz");
                }
            else if(i%5==0){
                System.out.println("buzz");}
            else System.out.println(i);
            }
        }

    }

