package days.day11;

import java.util.Scanner;

public class _big_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1.number: ");
        int number = scan.nextInt();

        System.out.print("2.number: ");
        int number2 = scan.nextInt();

        System.out.print("3.number: ");
        int number3 = scan.nextInt();

        int bignumber = number;

        if (number2 > number) {
           bignumber = number2;
        }
        if (number3 > number2){
             bignumber = number3;
        }
        System.out.print("The max number is: "+ bignumber );
    }
}
