import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static int prime(int number) {
        int prime = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = 1;
                break;
            }
        }
        if (prime == 0) {
//            System.out.println("Not prime");
            return number;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int number = 0, b = 0, m = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        ArrayList<Integer> list = new ArrayList<>();
        number = input.nextInt();

        while(number > 1){
            if ( prime(number)!= 0)
               System.out.println(prime(number));
//            System.out.println(number);
            number -- ;
        }


    }
}