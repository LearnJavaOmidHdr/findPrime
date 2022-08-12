import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int number = 0, b = 0, m = 0, multi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        ArrayList<Integer> list = new ArrayList<>();
        number = input.nextInt();
        int Condition = number;
        while (number > 1) {
            if (prime(number) != 0) {
                list.add(prime(number));
//               System.out.println(prime(number));
            }
            number--;
        }
        Collections.sort(list);
//        System.out.println(list);
        int count = 1,i=0;
        while(count<list.size()){
            multi = list.get(i) + list.get(count);
            if (multi > Condition) {
                count++;
                i = 1;
            } else if (multi == Condition) {
                System.out.print(list.get(i)+" + "+list.get(count) + " = "+Condition);
                System.out.println();
                i = 1;
                count++;
            }i ++;
        }


    }
}